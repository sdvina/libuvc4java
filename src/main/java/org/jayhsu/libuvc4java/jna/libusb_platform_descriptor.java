package org.jayhsu.libuvc4java.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * \ingroup libusb_desc<br>
 * A structure representing a Platform descriptor.<br>
 * This descriptor is documented in section 9.6.2.4 of the USB 3.2 specification.<br>
 * <i>native declaration : include\libusb.h:944</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class libusb_platform_descriptor extends Structure {
	public byte bLength;
	public byte bDescriptorType;
	public byte bDevCapabilityType;
	public byte bReserved;
	/** C type : uint8_t[16] */
	public byte[] PlatformCapabilityUUID = new byte[16];
	/** C type : uint8_t[0] */
	public byte[] CapabilityData = new byte[0];
	public libusb_platform_descriptor() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("bLength", "bDescriptorType", "bDevCapabilityType", "bReserved", "PlatformCapabilityUUID", "CapabilityData");
	}
	/**
	 * @param PlatformCapabilityUUID C type : uint8_t[16]<br>
	 * @param CapabilityData C type : uint8_t[0]
	 */
	public libusb_platform_descriptor(byte bLength, byte bDescriptorType, byte bDevCapabilityType, byte bReserved, byte PlatformCapabilityUUID[], byte CapabilityData[]) {
		super();
		this.bLength = bLength;
		this.bDescriptorType = bDescriptorType;
		this.bDevCapabilityType = bDevCapabilityType;
		this.bReserved = bReserved;
		if ((PlatformCapabilityUUID.length != this.PlatformCapabilityUUID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.PlatformCapabilityUUID = PlatformCapabilityUUID;
		if ((CapabilityData.length != this.CapabilityData.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.CapabilityData = CapabilityData;
	}
	public libusb_platform_descriptor(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends libusb_platform_descriptor implements Structure.ByReference {
		
	};
	public static class ByValue extends libusb_platform_descriptor implements Structure.ByValue {
		
	};
}
