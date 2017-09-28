package base64;

import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings("restriction")
public class JdkBase64 {

	private final static String src = "The string need to be encrypted";

	public static void jdkBase64() {
		BASE64Encoder encoder = new BASE64Encoder();
		String encode = encoder.encode(src.getBytes());
		System.out.println("encode str:" + encode);

		BASE64Decoder decoder = new BASE64Decoder();
		try {
			byte[] decodeByte = decoder.decodeBuffer(encode);
			String decodeStr = new String(decodeByte);
			System.out.println("decode str:" + decodeStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		jdkBase64();
	}

}
