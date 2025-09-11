package com.home.practice;

import java.util.Scanner;

//ispal
public class practice24_05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse:");
        String s = sc.nextLine();
        String pal = "";
        for(int i = s.length()-1;i>=0;i--){
            pal += s.charAt(i);
            }
        if(pal.equals(s)){
            System.out.println("is pal");
        }
        else{
            System.out.println("it not a ");
        }
        }
    }

