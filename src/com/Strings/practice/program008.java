package com.Strings.practice;

import java.util.Scanner;

public class program008 {
    public static void main(String[] args) {
        System.out.println("Enter a string to check for palindrome:");
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        boolean isPalindrome = true;
        String revs = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revs = revs + s.charAt(i);
        }
        if(revs.equals(s))
        {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        scn.close();
    }
}