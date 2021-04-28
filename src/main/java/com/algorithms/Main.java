package com.algorithms;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

//        CiphertextAutokey ciphertextAutokey = new CiphertextAutokey();
//        String result = ciphertextAutokey.encode("1110100100001111", "0011", "1001");
//        System.out.println(result);

//        CiphertextAutokey ciphertextAutokey = new CiphertextAutokey();
//        String result = ciphertextAutokey.decode("1110100100001111", "0011", "1001");
//        System.out.println(result);

        SynchronousStreamCipher synchronousStreamCipher = new SynchronousStreamCipher();
        String result = synchronousStreamCipher.encode("1110100100001111", "0010", "1001");
        System.out.println(result);

//        LFSR lfsr = new LFSR();
//        String result = lfsr.generate("10101", "10000", 5);
//        System.out.println(result);
    }
}
