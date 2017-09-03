FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.4.50"

SRCREV = "84125137f14e7cd5eb84312bf999bf519a50a64c"
SRC_URI = "git://github.com/thpham/linux-rt-rpi.git;protocol=git;branch=emlid-stable-4.4-rebase \
           file://0001-fix-dtbo-rules.patch \
"

require linux-raspberrypi.inc
