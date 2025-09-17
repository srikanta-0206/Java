package com.mock.practice;

import java.util.Scanner;

public class p5 {

    // Method to calculate GCD
    public static int gcd(int n, int m) {
        int gcd = 1;
        for (int i = 1; i <= m && i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Method to calculate LCM
    public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int n = sc.nextInt();
        System.out.println("Enter number 2:");
        int m = sc.nextInt();

        int g = gcd(n, m);
        int l = lcm(n, m);

        System.out.println("GCD of " + n + " and " + m + " is " + g);
        System.out.println("LCM of " + n + " and " + m + " is " + l);
    }
}

