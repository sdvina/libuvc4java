package org.jayhsu.libuvc4java.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * \ingroup libusb_desc<br>
 * A structure representing the SuperSpeed USB Device Capability descriptor<br>
 * This descriptor is documented in section 9.6.2.2 of the USB 3.0 specification.<br>
 * All multiple-byte fields are represented in host-endian format.<br>
 * <i>native declaration : include\libusb.h:877</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class libusb_ss_usb_device_capability_descriptor extends Structure {
	public byte bLength;
	public byte bDescriptorType;
	public byte bDevCapabilityType;
	public byte bmAttributes;
	public short wSpeedSupported;
	public byte bFunctionalitySupport;
	public byte bU1DevExitLat;
	public short bU2DevExitLat;
	public libusb_ss_usb_device_capability_descriptor() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("bLength", "bDescriptorType", "bDevCapabilityType", "bmAttributes", "wSpeedSupported", "bFunctionalitySupport", "bU1DevExitLat", "bU2DevExitLat");
	}
	public libusb_ss_usb_device_capability_descriptor(byte bLength, byte bDescriptorType, byte bDevCapabilityType, byte bmAttributes, short wSpeedSupported, byte bFunctionalitySupport, byte bU1DevExitLat, short bU2DevExitLat) {
		super();
		this.bLength = bLength;
		this.bDescriptorType = bDescriptorType;
		this.bDevCapabilityType = bDevCapabilityType;
		this.bmAttributes = bmAttributes;
		this.wSpeedSupported = wSpeedSupported;
		this.bFunctionalitySupport = bFunctionalitySupport;
		this.bU1DevExitLat = bU1DevExitLat;
		this.bU2DevExitLat = bU2DevExitLat;
	}
	public libusb_ss_usb_device_capability_descriptor(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends libusb_ss_usb_device_capability_descriptor implements Structure.ByReference {
		
	};
	public static class ByValue extends libusb_ss_usb_device_capability_descriptor implements Structure.ByValue {
		
	};
}
