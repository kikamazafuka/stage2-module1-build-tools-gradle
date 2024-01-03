package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen

        int num = Integer.parseInt(str);
        return num>0;
    }
}
