package com.company;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    Map<Integer, Integer> fibonacci = new HashMap<Integer, Integer>();

    public boolean isAlphabet(String str){
        boolean b= ((!str.equals("")) && (str != null) && (str.matches("^[a-zA-Z]*$")));
        return b;
    }

    public void listFibonacci() {
        fibonacci.put(97,0);
        fibonacci.put(98,1);
        fibonacci.put(65,0);
        fibonacci.put(66,1);
        int a = 0,b=1,c=99,d=67;

        for (int i = 0; i < 25; i++) {
            int temp = a;
            a = b;
            b = temp + b;
            fibonacci.put(c,b);
            fibonacci.put(d,b);
            c++;
            d++;
        }
    }

}