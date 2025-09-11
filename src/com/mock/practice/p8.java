package com.mock.practice;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number for reverse");
        String n= sc.nextLine();
        for(int i =n.length()-1; i>=0; i--){
            System.out.print(n.charAt(i));

        }

    }
}
