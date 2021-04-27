package com.algorithms;

public class LFSR {

    public String generate(String func, String seed, int n) {
        String result = "";
        int sum = 0;
        for (int j = 0; j < n; j++) {
            //System.out.println(seed);
            // Dodanie jedynek
            for (int i = 0; i < func.length(); i++) {
                if (func.charAt(i) == '1' && seed.charAt(i) == '1') {
                    sum++;
                }
            }
            sum %= 2;
            result += sum;
            seed = sum + seed.substring(0, seed.length()-1);
            sum = 0;
        }
        return result;
    }
}
