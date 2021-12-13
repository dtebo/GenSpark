package com.company;

import java.util.ArrayList;

public class Main {
    public static String reverseString(String str){
        String[] chars = str.split("");
        String reversed = "";

        for(int i = chars.length - 1; i >= 0; i--){
            reversed += chars[i];
        }

        return reversed;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverseString("Test"));
    }
}
