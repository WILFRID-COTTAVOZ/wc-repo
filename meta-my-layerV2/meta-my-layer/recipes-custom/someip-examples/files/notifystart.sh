#!/bin/sh
echo "Let's go Fabien, I will start notify example of vsomeip"
env VSOMEIP_CONFIGURATION=/etc/vsomeip/vsomeip-udp-service.json VSOMEIP_APPLICATION_NAME=service-sample ./notify-sample 
: exit 0
