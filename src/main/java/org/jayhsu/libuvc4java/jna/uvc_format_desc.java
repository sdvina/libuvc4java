package org.jayhsu.libuvc4java.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;
import java.util.Arrays;
import java.util.List;
import org.jayhsu.libuvc4java.jna.LibuvcLibrary.uvc_streaming_interface;
/**
 * <i>native declaration : include\libuvc.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class uvc_format_desc extends Structure {
	/** C type : uvc_streaming_interface* */
	public uvc_streaming_interface parent;
	/** C type : uvc_format_desc* */
	public uvc_format_desc.ByReference prev;
	/** C type : uvc_format_desc* */
	public uvc_format_desc.ByReference next;
	/**
	 * @see uvc_vs_desc_subtype<br>
	 * C type : uvc_vs_desc_subtype
	 */
	public int bDescriptorSubtype;
	public byte bFormatIndex;
	public byte bNumFrameDescriptors;
	/** C type : field1_union */
	public field1_union field1;
	/** C type : field2_union */
	public field2_union field2;
	public byte bDefaultFrameIndex;
	public byte bAspectRatioX;
	public byte bAspectRatioY;
	public byte bmInterlaceFlags;
	public byte bCopyProtect;
	public byte bVariableSize;
	/** C type : uvc_frame_desc* */
	public org.jayhsu.libuvc4java.jna.uvc_frame_desc.ByReference frame_descs;
	/** C type : uvc_still_frame_desc* */
	public org.jayhsu.libuvc4java.jna.uvc_still_frame_desc.ByReference still_frame_desc;
	/** <i>native declaration : include\libuvc.h:194</i> */
	public static class field1_union extends Union {
		/** C type : uint8_t[16] */
		public byte[] guidFormat = new byte[16];
		/** C type : uint8_t[4] */
		public byte[] fourccFormat = new byte[4];
		public field1_union() {
			super();
		}
		/** @param guidFormat_or_fourccFormat C type : uint8_t[16], or C type : uint8_t[4] */
		public field1_union(byte guidFormat_or_fourccFormat[]) {
			super();
			if ((guidFormat_or_fourccFormat.length != this.guidFormat_or_fourccFormat.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.fourccFormat = this.guidFormat = guidFormat_or_fourccFormat;
			setType(byte[].class);
		}
		public field1_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends field1_union implements Structure.ByReference {
			
		};
		public static class ByValue extends field1_union implements Structure.ByValue {
			
		};
	};
	/** <i>native declaration : include\libuvc.h:199</i> */
	public static class field2_union extends Union {
		public byte bBitsPerPixel;
		public byte bmFlags;
		public field2_union() {
			super();
		}
		public field2_union(byte bBitsPerPixel_or_bmFlags) {
			super();
			this.bmFlags = this.bBitsPerPixel = bBitsPerPixel_or_bmFlags;
			setType(Byte.TYPE);
		}
		public field2_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends field2_union implements Structure.ByReference {
			
		};
		public static class ByValue extends field2_union implements Structure.ByValue {
			
		};
	};
	public uvc_format_desc() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("parent", "prev", "next", "bDescriptorSubtype", "bFormatIndex", "bNumFrameDescriptors", "field1", "field2", "bDefaultFrameIndex", "bAspectRatioX", "bAspectRatioY", "bmInterlaceFlags", "bCopyProtect", "bVariableSize", "frame_descs", "still_frame_desc");
	}
	public uvc_format_desc(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends uvc_format_desc implements Structure.ByReference {
		
	};
	public static class ByValue extends uvc_format_desc implements Structure.ByValue {
		
	};
}
