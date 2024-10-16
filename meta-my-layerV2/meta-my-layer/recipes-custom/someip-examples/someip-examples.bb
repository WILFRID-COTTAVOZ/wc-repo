SUMMARY = "SomeIP examples: Hello World and basic routing function for SDV"
SECTION = "custom"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI  += "file://hello_world_client"
SRC_URI  += "file://hello_world_service"
SRC_URI  += "file://notify-sample"
SRC_URI  += "file://request-sample"
SRC_URI  += "file://response-sample"
SRC_URI  += "file://subscribe-sample"
SRC_URI  += "file://notifyinit.sh"
SRC_URI  += "file://notifystart.sh"
SRC_URI  += "file://request-sampleCalculette"
SRC_URI  += "file://response-sampleCalculette"
SRC_URI  += "file://responsecalcinit.sh"
SRC_URI  += "file://responsecalcstart.sh"
SRC_URI  += "file://vsomeip-udp-service.json"

RDEPENDS:${PN} += "vsomeip"
RDEPENDS:${PN} += "net-tools"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${WORKDIR}/hello_world_client ${D}${bindir}
	install -m 0755 ${WORKDIR}/hello_world_service ${D}${bindir}
    	install -m 0755 ${WORKDIR}/notify-sample ${D}${bindir}
	install -m 0755 ${WORKDIR}/request-sample ${D}${bindir}
	install -m 0755 ${WORKDIR}/response-sample ${D}${bindir}
	install -m 0755 ${WORKDIR}/subscribe-sample ${D}${bindir}
	install -m 0777 ${WORKDIR}/notifyinit.sh ${D}${bindir}
	install -m 0777 ${WORKDIR}/notifystart.sh ${D}${bindir}
	install -m 0755 ${WORKDIR}/request-sampleCalculette ${D}${bindir}
	install -m 0755 ${WORKDIR}/response-sampleCalculette ${D}${bindir}
	install -m 0777 ${WORKDIR}/responsecalcinit.sh ${D}${bindir}
	install -m 0777 ${WORKDIR}/responsecalcstart.sh ${D}${bindir}
	install -m 0777 ${WORKDIR}/vsomeip-udp-service.json ${D}${bindir}
}

FILES:${PN} += "${bindir}/hello_world_client"
FILES:${PN} += "${bindir}/hello_world_service"
FILES:${PN} += "${bindir}/notify-sample"
FILES:${PN} += "${bindir}/request-sample"
FILES:${PN} += "${bindir}/response-sample"
FILES:${PN} += "${bindir}/subscribe-sample"
FILES:${PN} += "${bindir}/notifyinit.sh"
FILES:${PN} += "${bindir}/notifystart.sh"
FILES:${PN} += "${bindir}/request-sampleCalculette"
FILES:${PN} += "${bindir}/response-sampleCalculette"
FILES:${PN} += "${bindir}/responsecalcinit.sh"
FILES:${PN} += "${bindir}/responsecalcstart.sh"
FILES:${PN} += "${bindir}/vsomeip-udp-service.json"
