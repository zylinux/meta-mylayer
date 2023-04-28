IMAGE_INSTALL += "hello hello-m hello-a hello-c testapphello alsa-utils service"
# add Qt5 packagegroup
# 
FEATURE_PACKAGES_qt5 = "packagegroup-qt5-toolchain-target"
EXTRA_IMAGE_FEATURES += "qt5"

# Use systemd init manager.
DISTRO_FEATURES:append = " systemd"
VIRTUAL-RUNTIME_init_manager = "systemd"
DISTRO_FEATURES_BACKFILL_CONSIDERED += "sysvinit"



