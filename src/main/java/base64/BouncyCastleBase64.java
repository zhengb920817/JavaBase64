package base64;

import org.bouncycastle.util.encoders.Base64;

public class BouncyCastleBase64 {

	private final static String src = "The string need to be encrypted";

	public static void bouncyCastleBase64() {

		byte[] encodeBytes = Base64.encode(src.getBytes());
		String encodeStr = new String(encodeBytes);
		System.out.println(encodeStr);

		byte[] bytes = Base64.decode(encodeStr);
		String decodeStr = new String(bytes);
		System.out.println(decodeStr);
	}

	public static void main(String[] args) {
		bouncyCastleBase64();
	}

}
