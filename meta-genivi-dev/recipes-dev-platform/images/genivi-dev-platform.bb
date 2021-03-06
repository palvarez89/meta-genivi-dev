# Copyright (C) 2014-2016 GENIVI Alliance
# Released under the MIT license (see COPYING.MIT for the terms)

# Base this image on generic IVI image
require recipes-yocto-ivi/images/ivi-image.inc

DESCRIPTION = "GENIVI Development Platform image which includes currently a simple \
HMI and three proof-of-concepts (PoC's) and demos. The GENIVI Browser PoC, \
the Fuel-Stop-Adviser (FSA) PoC and the GENIVI AudioManager (AM) Demo."

PV = "1.3+snapshot-${DATE}"

BOOT_SPACE_raspberrypi2 = "40960"

IMAGE_FEATURES_append = " \
    ssh-server-openssh    \
    "

IMAGE_INSTALL_append = " \
    packagegroup-abstract-component-p1 \
    packagegroup-placeholder-component-p1 \
    packagegroup-specific-component-p2 \
    packagegroup-abstract-component-p2 \
    packagegroup-specific-component-p1 \
    packagegroup-gdp-am-demo \
    packagegroup-gdp-browser \
    packagegroup-gdp-fsa \
    packagegroup-gdp-gps \
    packagegroup-gdp-hmi \
    packagegroup-gdp-qt5 \
    boost \
    "

IMAGE_INSTALL_append_rcar-gen2 = " \
    gles-kernel-module \
    libegl \
    libegl-dev \
    libgbm-dev \
    "

IMAGE_INSTALL_append_raspberrypi2 = " mesa-megadriver"
