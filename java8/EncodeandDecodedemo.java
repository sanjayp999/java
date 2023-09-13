package com.java8;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeandDecodedemo {
	public static void main(String[] args) {
		String pass="sanjay@99";
		
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pass.getBytes());
		//now convert bytearray into string
		String encodecpass=new String(encode);
		System.out.println(encodecpass);
		
		
		//we have t pass encoded password into base64decode to get decoded password
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodecpass);
		String decoded= new String(decode);
		System.out.println(decoded);
	}

}
