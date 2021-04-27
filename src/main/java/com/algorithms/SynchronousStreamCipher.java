package com.algorithms;

public class SynchronousStreamCipher {

    public String encode(String sequence, String seed, String func) {
        LFSR lfsr = new LFSR();
        String resultLFSR = lfsr.generate(func, seed, sequence.length());
        String result = "";

        for (int i = 0; i < sequence.length(); i++) {
            int sequenceBit = Character.getNumericValue(sequence.charAt(i));
            int resultBit = Character.getNumericValue(resultLFSR.charAt(i));
            result += sequenceBit ^ resultBit;
        }
        return result;
    }
}
