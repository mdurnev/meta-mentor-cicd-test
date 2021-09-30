SUMMARY = "Foo"
DESCRIPTION = "Foo foo foo"

LICENSE = "GPLv2+"

SRC_URI = "git://git@github.com/mdurnev/cicd-test.git;protocol=https;branch=master"
SRCREV = "b939da53e441f45bc04cd5ca727074277d43b9b5"
PV = "0.1+git${SRCPV}"

S = "${WORKDIR}/git"

inherip autotools-brokensep
