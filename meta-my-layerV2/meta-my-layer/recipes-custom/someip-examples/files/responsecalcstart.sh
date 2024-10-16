#!/bin/sh
echo "Let's go Fabien, I will start the calculator variant of the response example of vsomeip"
env VSOMEIP_CONFIGURATION=/etc/vsomeip/vsomeip-udp-service.json VSOMEIP_APPLICATION_NAME=service-sample /usr/bin/response-sampleCalculette 
: exit 0
