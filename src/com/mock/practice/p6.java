package com.mock.practice;

import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numebr 1");
        int m = sc.nextInt();
        System.out.println("enter number 2");
        int n = sc.nextInt();
        int result = gcd(m, n);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}

