# -----------------------------------------------------------------------------
# Makefile for im4java
#
# $Author: bablokb $
# $Revision: 1.19 $
#
# License: GPL2 (see COPYING)
# -----------------------------------------------------------------------------

.PHONY: all src test test-prepare jar clean distclean \
        srcdist bindist predist srcarch binarch postdist \
        inc-dist-major inc-dist-minor inc-dist-pl

export 
include version.inc
VERSION  = $(DIST_MAJOR).$(DIST_MINOR).$(DIST_PL)

DIST       := im4java
DIST_NAME  := $(DIST)-$(VERSION)
DIST_STUFF := $(wildcard README* NEWS TODO INSTALL ChangeLog COPYING*) Makefile \
	      version.inc bin input images.src src

JAVA_PACKAGE=org.im4java.core
JAVA_TEST_CLASS=org.im4java.test.Test

PREFIX    = /usr/local
BINDIR    = $(PREFIX)/bin
ETCDIR    = /etc
SBINDIR   = $(PREFIX)/sbin
MANDIR    = $(PREFIX)/share/man
MAN1DIR   = $(MANDIR)/man1
MAN5DIR   = $(MANDIR)/man5
SHAREDIR  = $(PREFIX)/share/$(DIST)

# targets ---------------------------------------------------------------------

default:
	@echo -e "\nmain targets:\n"
	@echo -e "\tall:       recreates source and jar from scratch"
	@echo -e "\tsrc:       create java-sources from interface-definitions"
	@echo -e "\tcompile:   compile source-code"
	@echo -e "\tjar:       create im4java-library file $(DIST_NAME).jar"
	@echo -e "\ttest:      run test-suite\n"
	@echo -e "\tsrcdist:   create source-distribution"
	@echo -e "\tbindist:   create binary-distribution (also includes source)\n"
	@echo -e "\tclean:     cleanup after compile and test"
	@echo -e "\tdistclean: complete cleanup"
	@echo -e ""

all: clean src jar

src:
	bin/mk-im4java -p $(JAVA_PACKAGE)

compile:
	rm -fr build/*
	mkdir -p build
	javac -Xlint:unchecked -d build/ -cp src `find src -name "*.java"`

jar: compile
	jar cmf input/manifest.mf $(DIST_NAME).jar -C build/ .

TESTS=all
test-prepare:
	rm -fr images
	cp -a images.src images
	cp -a "images/tulip2.jpg" "images/tulip 2.jpg"
	chmod +w images/*.jpg

test: test-prepare
	java -cp build $(JAVA_TEST_CLASS) $(TESTS)

# targets (cleanup and distribution) ------------------------------------------

clean:
	rm -fr $(DIST)-*.tar.bz2
	rm -fr build/* images

distclean: clean
	rm -fr src/$(subst .,/,$(JAVA_PACKAGE))/IMOps.java

srcdist: predist srcarch postdist

bindist: predist binarch postdist

predist:
	rm -f $(DIST_NAME)-*.tar.bz2
	tar -cpzf $(DIST_NAME).tgz --exclude "CVS" \
           --exclude ".cvsignore" --exclude ".project" \
           --exclude ".classpath" $(DIST_STUFF)
	rm -fr $(DIST_NAME)
	mkdir $(DIST_NAME)

srcarch:
	(cd $(DIST_NAME); tar -xpzf ../$(DIST_NAME).tgz; \
         $(MAKE) distclean src \
        )
	tar -cpjf $(DIST_NAME)-src.tar.bz2 $(DIST_NAME)

binarch:
	(cd $(DIST_NAME); tar -xpzf ../$(DIST_NAME).tgz; \
         $(MAKE) distclean src jar; \
         $(MAKE) clean \
        )
	tar -cpjf $(DIST_NAME)-bin.tar.bz2 $(DIST_NAME)

postdist:
	rm -fr $(DIST_NAME) $(DIST_NAME).tgz


# targets (version management)  -----------------------------------------------

commit-version:
	cvs commit -m"upgraded version to $(VERSION)" version.inc

inc-dist-major:
	@echo DIST_MAJOR=$$[$(DIST_MAJOR)+1] > version.inc
	@echo DIST_MINOR=0 >> version.inc
	@echo DIST_PL=0 >> version.inc
	$(MAKE) commit-version
	@cat version.inc

inc-dist-minor:
	@echo DIST_MAJOR=$(DIST_MAJOR) > version.inc
	@echo DIST_MINOR=$$[$(DIST_MINOR)+1] >> version.inc
	@echo DIST_PL=0 >> version.inc
	$(MAKE) commit-version
	@cat version.inc

inc-dist-pl:
	@echo DIST_MAJOR=$(DIST_MAJOR) > version.inc
	@echo DIST_MINOR=$(DIST_MINOR) >> version.inc
	@echo DIST_PL=$$[$(DIST_PL)+1] >> version.inc
	$(MAKE) commit-version
	@cat version.inc
