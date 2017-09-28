package base64;

import org.apache.commons.codec.binary.Base64;

public class CommonsCodecBase64 {

	private final static String src = "The string need to be encrypted";

	public static void commonsBase64() {
		byte[] encodeBytes = Base64.encodeBase64(src.getBytes());
		String encodeStr = new String(encodeBytes);
		System.out.println("encode str :" + encodeStr);

		byte[] decodeBytes = Base64.decodeBase64(encodeStr);
		String decodeString = new String(decodeBytes);
		System.out.println("decode Str :" + decodeString);
	}

	public static void main(String[] args) {

		commonsBase64();

	}
}
