package medium;

public class WhatMissingLetter {

    public static String missingLetter(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i + 1) - str.charAt(i) != 1) {
                char c = str.charAt(i);
                ++c;
                return String.valueOf(c);
            }
        }
        return "No Missing Letter";
    }

    public static void main(String[] args) {
        System.out.println(missingLetter("abdefg"));
        System.out.println(missingLetter("mnopqs"));
        System.out.println(missingLetter("xyz"));
    }
}
