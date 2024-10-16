SUMMARY = "A console-only image that fully supports the target device \
hardware. This layer has been built by Fabien Violier"

LICENSE = "MIT"

inherit core-image
IMAGE_FEATURES += "splash"
IMAGE_FEATURES += "tools-debug"
IMAGE_FEATURES += "tools-profile"
IMAGE_FEATURES += "tools-sdk"
IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_INSTALL:append = " mc"
IMAGE_INSTALL:append = " nano"
IMAGE_INSTALL:append = " net-tools"

#Install RO/RW fs script
IMAGE_INSTALL:append = " my-scripts"

#Add python hello script
IMAGE_INSTALL:append = " python-hello"

#Add wifi activation script
IMAGE_INSTALL:append = " script-wifi"

#Add someIP examples script
IMAGE_INSTALL:append = " someip-examples"

#Add Azerty keyboard manual loader
IMAGE_INSTALL:append = " frkeymap"


#IMAGE_FEATURES += "read-only-rootfs"
