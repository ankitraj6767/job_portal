package com.blueyonder.day7;

import java.util.Arrays;
import java.util.Base64;

public class Base64EncoderDecoder {

    public static void main(String[] args) {
        Base64.Encoder encoder=Base64.getEncoder();
        byte []bytes={1,2};
        byte []bytes2=encoder.encode(bytes);
        System.out.println("Encoded byte array: "+ Arrays.toString(bytes2));

        byte []bytes3=new byte[10];
        int x= encoder.encode(bytes2,bytes3);
        System.out.println("Encoded bytes written to another array: "+ Arrays.toString(bytes3));
        System.out.println("Number of bytes written = "+x);

        String str=encoder.encodeToString("Stackroute".getBytes());
        System.out.println("Encoded string: "+str);

        Base64.Decoder decoder=Base64.getDecoder();
        String decodedStr=new String(decoder.decode(str));
        System.out.println("Decoded string: "+decodedStr);
    }
}
