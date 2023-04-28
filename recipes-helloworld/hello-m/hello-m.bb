# helloworld application
SUMMARY = "helloworld of makefile recipe"
DESCRIPTION = "My hello world application"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/:"
SRC_URI = "file://helloworld-m/"

S = "${WORKDIR}"

CFLAGS:append = "-Wall -O -g"

EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS}'"
EXTRA_OEMAKE:append = " 'LDFLAGS=${LDFLAGS}'"
EXTRA_OEMAKE:append = " 'DESTDIR=${D}'"

do_compile() {
	oe_runmake -C helloworld-m
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 helloworld-m/helloworld-m ${D}${bindir}
}

#do_install() {
#        oe_runmake install
#}

# if no install target in makefile, using this do_install
#do_install () {
#install -d ${D}${bindir}/
#install -m 0755 ${S}/helloworld ${D}${bindir}/
#}

# if no LDFLAGS, using this
#INSANE_SKIP_${PN} += "ldflags"

FILES_${PN} = "${bindir}/"

