package com.Strings.practice;

public class assinment2 {
    public static void main(String[] args) {
        String s = "java";
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
        }
        if (vowelCount >= 3) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    result += " ";
                } else {
                    result += ch;
                }
            }
            System.out.println("Modified: " + result);
        } else {
            System.out.println("Original: " + s);
        }
    }
}
