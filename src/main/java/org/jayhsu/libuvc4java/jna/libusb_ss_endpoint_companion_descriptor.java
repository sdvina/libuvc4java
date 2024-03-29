package org.jayhsu.libuvc4java.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * \ingroup libusb_desc<br>
 * A structure representing the superspeed endpoint companion<br>
 * descriptor. This descriptor is documented in section 9.6.7 of<br>
 * the USB 3.0 specification. All multiple-byte fields are represented in<br>
 * host-endian format.<br>
 * <i>native declaration : include\libusb.h:776</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class libusb_ss_endpoint_companion_descriptor extends Structure {
	public byte bLength;
	public byte bDescriptorType;
	public byte bMaxBurst;
	public byte bmAttributes;
	public short wBytesPerInterval;
	public libusb_ss_endpoint_companion_descriptor() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("bLength", "bDescriptorType", "bMaxBurst", "bmAttributes", "wBytesPerInterval");
	}
	public libusb_ss_endpoint_companion_descriptor(byte bLength, byte bDescriptorType, byte bMaxBurst, byte bmAttributes, short wBytesPerInterval) {
		super();
		this.bLength = bLength;
		this.bDescriptorType = bDescriptorType;
		this.bMaxBurst = bMaxBurst;
		this.bmAttributes = bmAttributes;
		this.wBytesPerInterval = wBytesPerInterval;
	}
	public libusb_ss_endpoint_companion_descriptor(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends libusb_ss_endpoint_companion_descriptor implements Structure.ByReference {
		
	};
	public static class ByValue extends libusb_ss_endpoint_companion_descriptor implements Structure.ByValue {
		
	};
}
