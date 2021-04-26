package com.algorithms;

public class LFSR {
    int N = 10;

    public void generate(String func) {
        String result = "10000";
        System.out.println(result);
        int sum = 0;
        for (int j = 0; j < N; j++) {
            // Dodanie jedynek
            for (int i = 0; i < func.length(); i++) {
                if (func.charAt(i) == '1' && result.charAt(i) == '1') {
                    sum++;
                }
            }
            // Pozostale operacje
            sum %= 2;
            result = sum + result.substring(0, result.length()-1);
            System.out.println(result);
            sum = 0;
        }
    }
}
