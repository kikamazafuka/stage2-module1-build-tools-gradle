package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str.length()<1 || str.charAt(0)=='-'){
            return false;
        }
        double num;
        try {
            num = Double.parseDouble(str);
        }catch (NumberFormatException e){
            return false;
        }
        return num>0;
    }
}
