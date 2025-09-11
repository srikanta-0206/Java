package com.mock.practice;
import java.util.Currency;
import java.util.Scanner;
public class p4{
    public static void primes(int current,int n) {
        if(current>n)return;
        boolean p = true;
        for(int i =2;i<=current/2;i++){
            if(current%i==0){
                 p = false;
                break;
            }



    }
        if(current >1 && p) System.out.print(current+ " ");
        primes(current+1,n);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      primes(2, n);
    }
}
