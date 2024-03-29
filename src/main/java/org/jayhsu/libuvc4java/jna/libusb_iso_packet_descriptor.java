package org.jayhsu.libuvc4java.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * \ingroup libusb_asyncio<br>
 * Isochronous packet descriptor.<br>
 * <i>native declaration : include\libusb.h:1257</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class libusb_iso_packet_descriptor extends Structure {
	public int length;
	public int actual_length;
	/**
	 * @see libusb_transfer_status<br>
	 * C type : libusb_transfer_status
	 */
	public int status;
	public libusb_iso_packet_descriptor() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("length", "actual_length", "status");
	}
	/**
	 * @param status @see libusb_transfer_status<br>
	 * C type : libusb_transfer_status
	 */
	public libusb_iso_packet_descriptor(int length, int actual_length, int status) {
		super();
		this.length = length;
		this.actual_length = actual_length;
		this.status = status;
	}
	public libusb_iso_packet_descriptor(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends libusb_iso_packet_descriptor implements Structure.ByReference {
		
	};
	public static class ByValue extends libusb_iso_packet_descriptor implements Structure.ByValue {
		
	};
}
