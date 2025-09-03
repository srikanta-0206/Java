package com.mock.practice;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rangge");
        int n = sc.nextInt();
        System.out.println("even");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println("odd");
            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + ",");

                }
            }
        }
    }
