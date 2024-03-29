package org.jayhsu.libuvc4java.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\libuvc.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class uvc_frame_desc extends Structure {
	/** C type : uvc_format_desc* */
	public org.jayhsu.libuvc4java.jna.uvc_format_desc.ByReference parent;
	/** C type : uvc_frame_desc* */
	public uvc_frame_desc.ByReference prev;
	/** C type : uvc_frame_desc* */
	public uvc_frame_desc.ByReference next;
	/**
	 * @see uvc_vs_desc_subtype<br>
	 * C type : uvc_vs_desc_subtype
	 */
	public int bDescriptorSubtype;
	public byte bFrameIndex;
	public byte bmCapabilities;
	public short wWidth;
	public short wHeight;
	public int dwMinBitRate;
	public int dwMaxBitRate;
	public int dwMaxVideoFrameBufferSize;
	public int dwDefaultFrameInterval;
	public int dwMinFrameInterval;
	public int dwMaxFrameInterval;
	public int dwFrameIntervalStep;
	public byte bFrameIntervalType;
	public int dwBytesPerLine;
	/** C type : uint32_t* */
	public IntByReference intervals;
	public uvc_frame_desc() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("parent", "prev", "next", "bDescriptorSubtype", "bFrameIndex", "bmCapabilities", "wWidth", "wHeight", "dwMinBitRate", "dwMaxBitRate", "dwMaxVideoFrameBufferSize", "dwDefaultFrameInterval", "dwMinFrameInterval", "dwMaxFrameInterval", "dwFrameIntervalStep", "bFrameIntervalType", "dwBytesPerLine", "intervals");
	}
	public uvc_frame_desc(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends uvc_frame_desc implements Structure.ByReference {
		
	};
	public static class ByValue extends uvc_frame_desc implements Structure.ByValue {
		
	};
}
