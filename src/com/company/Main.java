package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        String name;
        boolean check;
        Fibonacci one =new Fibonacci();

        System.out.println("Enter a Name ");
        do {
            name = scan.nextLine();
            check = one.isAlphabet(name);
            if (check) {
                one.listFibonacci();
                for (int i = 0; i < name.length(); i++) {
                    int ascii = name.charAt(i);
                    sum = sum + one.fibonacci.get(ascii);
                }
            } else {
                System.out.println("Enter valid Name");
            }
        }while(!check);
        System.out.println("Fibonacci Sum=" + sum);
    }
}
