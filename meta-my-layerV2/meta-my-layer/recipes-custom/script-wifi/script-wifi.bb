SUMMARY = "script to configuration some parameter for wifi"
SECTION = "custom"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI += "file://start-wifi.sh"


do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/start-wifi.sh ${D}${bindir}
}

FILES:${PN} += "${bindir}/start-wifi.sh"
