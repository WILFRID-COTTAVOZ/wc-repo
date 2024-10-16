#!/bin/sh
echo "Hello Fabien, I will set everything needed to start an application of the vsomeip"
ifdown eth0
ifup wlan0
cp /usr/bin/vsomeip-udp-service.json /etc/vsomeip/vsomeip-udp-service.json
route add -nv 224.244.224.245 dev wlan0
route
export LD_LIBRARY_PATH=/usr/lib/:$LD_LIBRARY_PATH
echo $LD_LIBRARY_PATH
: exit 0
