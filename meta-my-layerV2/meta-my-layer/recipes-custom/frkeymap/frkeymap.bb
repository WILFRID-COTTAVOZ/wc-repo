SUMMARY = "copy fr.keymap file to be able to load it and use azerty keyboard"
SECTION = "custom"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI += "file://fr.keymap"
SRC_URI += "file://azertyloader.sh"

do_install() {
    	install -d ${D}${bindir}
    	install -m 0777 ${WORKDIR}/fr.keymap ${D}${bindir}
	install -m 0777 ${WORKDIR}/azertyloader.sh ${D}${bindir}
}

FILES:${PN} += "${bindir}/fr.keymap"
FILES:${PN} += "${bindir}/azertyloader.sh"
