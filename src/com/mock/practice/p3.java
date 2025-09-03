package com.mock.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a start  range");
        int start = sc.nextInt();
        System.out.println("Enter a end  range");
        int end = sc.nextInt();
        System.out.print("From range  " + start + " to " + " " + end + " " + "prime numbers are");
        ArrayList<Integer> a = new ArrayList<>();
        if (start<=0&&end<=0) {
            System.out.println(start + " " + end + " " + "is a prime number");
        } else {
            for (int i = start; i <= end; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    a.add(i);
                    System.out.print(" " + i + " ");
                }
            }
            System.out.println(" ");
        }
    int tt=a.get(a.size()-3);
        System.out.println("The Third Highest prime number is "+" "+tt);
    }
}










