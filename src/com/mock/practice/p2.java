package com.mock.practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class p2 {
    public static int eve(int n){
        if(n==0){
            return n;
        }
        if(n%2==0){
            System.out.print(n+" ");
        }
        return eve(n-1);
    }
    public static int odd(int n){
        if(n==0){
            return n;
        }
        if(n%2!=0){
            System.out.print(n+" ");
        }
        return odd(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A RANGE");
        int n = sc.nextInt();
        System.out.println("------------------");
        System.out.println("");
        System.out.print("Even  "+ " ");
        System.out.println("");
        p2.eve(n);
        System.out.println("");
        System.out.print("odd  "+ " ");
        p2.odd(n);


//        System.out.println("odd" + odd);



    }
}
