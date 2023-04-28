# helloworld application
SUMMARY = "helloworld of Autotools recipe"
DESCRIPTION = "My hello world application"
LICENSE = "CLOSED"

inherit autotools

FILESEXTRAPATHS:prepend := "${THISDIR}/:"
SRC_URI = "file://helloworld-a/"

S = "${WORKDIR}/helloworld-a"

#CFLAGS:append = "-Wall -O -g"

FILES_${PN} = "${bindir}/"
