package com.Strings.practice;

import java.util.Scanner;

public class program007 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String n = scn.nextLine();
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);

            if (ch >= '0' && ch <= '9') {
                sum += ch - '0';
            }
        }

        System.out.print("Sum of digits in the string: " + sum);
        scn.close();
    }
}
