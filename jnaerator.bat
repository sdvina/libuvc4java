rd /s /q _jna_code

java -jar D:\Develop_Tools\jnaerator-0.12-shaded.jar ^
    -runtime JNA ^
    -mode Maven ^
    -mavenGroupId org.jayhsu ^
    -mavenArtifactId libuvc4java ^
    -o _jna_code ^
    -package org.jayhsu.libuvc4java.jna ^
    -f ^
    -library libusb bin\libusb-1.0.dll include\libusb.h ^
    -library libuvc bin\libuvc.dll include\libuvc.h