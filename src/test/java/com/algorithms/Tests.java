package com.algorithms;

import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void SynchronousStreamCipherEncodeTest() {
        SynchronousStreamCipher synchronousStreamCipher = new SynchronousStreamCipher();
        String result = synchronousStreamCipher.encode("1110100100001111", "0010", "1001");
        assert result.equals("1001001111000111");
    }

    @Test
    public void SynchronousStreamCipherDecodeTest() {
        SynchronousStreamCipher synchronousStreamCipher = new SynchronousStreamCipher();
        String result = synchronousStreamCipher.encode("1001001111000111", "0010", "1001");
        assert result.equals("1110100100001111");
    }

    @Test
    public void CiphertextAutokeyEncodeTest() {
        CiphertextAutokey ciphertextAutokey = new CiphertextAutokey();
        String result = ciphertextAutokey.encode("1001001111000111", "0011", "1001");
        assert result.equals("0110011011001101");
    }

    @Test
    public void CiphertextAutokeyDecodeTest() {
        CiphertextAutokey ciphertextAutokey = new CiphertextAutokey();
        String result = ciphertextAutokey.decode("0110011011001101", "0011", "1001");
        assert result.equals("1001001111000111");
    }
}
