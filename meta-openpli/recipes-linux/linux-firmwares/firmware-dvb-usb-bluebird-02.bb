require linux-firmware.inc

DESCRIPTION = "Firmware for dvb-usb-bluebird-02"

do_install() {
	install -d ${D}${base_libdir}/firmware
	install -m 0644 dvb-usb-bluebird-02.fw ${D}${base_libdir}/firmware
}
