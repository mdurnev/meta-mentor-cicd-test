SUMMARY = "Bar"
DESCRIPTION = "Bar bar bar"

LICENSE = "GPLv2+"

SRC_URI = "git://git@github.com/mdurnev/cicd-test2.git;protocol=https;branch=master"
SRCREV = "de0116444ef214123ae414d50e9725bd23011f1e"
PV = "0.1+git${SRCPV}"

S = "${WORKDIR}/git"

inherip autotools-brokensep
