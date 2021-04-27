package com.algorithms;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        SynchronousStreamCipher synchronousStreamCipher = new SynchronousStreamCipher();
        String result = synchronousStreamCipher.encode("1111000011110000", "1110", "0001");
        System.out.println(result);

//        LFSR lfsr = new LFSR();
//        String result = lfsr.generate("10101", "10000", 5);
//        System.out.println(result);
    }
}
