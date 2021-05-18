package com.algorithms;

public class CiphertextAutokey {

    public String encode(String sequence, String seed, String func) {
        String result = "";
        int sum = 0;
        for (int j = 0; j < sequence.length(); j++) {
            //System.out.println(seed);
            for (int i = 0; i < func.length(); i++) {
                if (func.charAt(i) == '1') {
                    sum += Character.getNumericValue(seed.charAt(i));
                }
            }
            sum += Character.getNumericValue(sequence.charAt(j));
            sum %= 2;
            result += sum;
            seed = sum + seed.substring(0, seed.length()-1);
            sum = 0;
        }
        return result;
    }

    public String decode(String sequence, String seed, String func) {
        String result = "";
        int sum = 0;
        for (int j = 0; j < sequence.length(); j++) {
            //System.out.println(seed);
            for (int i = 0; i < func.length(); i++) {
                if (func.charAt(i) == '1') {
                    sum += Character.getNumericValue(seed.charAt(i));
                }
            }
            sum += Character.getNumericValue(sequence.charAt(j));
            sum %= 2;
            result += sum;
            seed = sequence.charAt(j) + seed.substring(0, seed.length()-1);
            sum = 0;
        }
        return result;
    }
}
