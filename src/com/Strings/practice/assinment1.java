package com.Strings.practice;
import java.util.Scanner;
public class assinment1 {
    public static void main(String[] args)
    {
        String s = "Boss";
        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length()-1; i++)
        {
            if (ch[i] == ch[i+1])
            {
               ch[i+1]='$';
            }
            System.out.println(ch);
        }
    }
}
