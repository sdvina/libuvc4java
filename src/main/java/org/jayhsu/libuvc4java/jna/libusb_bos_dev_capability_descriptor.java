package org.jayhsu.libuvc4java.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * \ingroup libusb_desc<br>
 * A generic representation of a BOS Device Capability descriptor. It is<br>
 * advised to check bDevCapabilityType and call the matching<br>
 * libusb_get_*_descriptor function to get a structure fully matching the type.<br>
 * <i>native declaration : include\libusb.h:805</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class libusb_bos_dev_capability_descriptor extends Structure {
	public byte bLength;
	public byte bDescriptorType;
	public byte bDevCapabilityType;
	/** C type : uint8_t[0] */
	public byte[] dev_capability_data = new byte[0];
	public libusb_bos_dev_capability_descriptor() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("bLength", "bDescriptorType", "bDevCapabilityType", "dev_capability_data");
	}
	/** @param dev_capability_data C type : uint8_t[0] */
	public libusb_bos_dev_capability_descriptor(byte bLength, byte bDescriptorType, byte bDevCapabilityType, byte dev_capability_data[]) {
		super();
		this.bLength = bLength;
		this.bDescriptorType = bDescriptorType;
		this.bDevCapabilityType = bDevCapabilityType;
		if ((dev_capability_data.length != this.dev_capability_data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dev_capability_data = dev_capability_data;
	}
	public libusb_bos_dev_capability_descriptor(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends libusb_bos_dev_capability_descriptor implements Structure.ByReference {
		
	};
	public static class ByValue extends libusb_bos_dev_capability_descriptor implements Structure.ByValue {
		
	};
}
