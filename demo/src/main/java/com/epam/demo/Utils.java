package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for(String s : args){
            int n = Integer.parseInt(s);
            if (n<0){
                return false;
            }
        }
        return true;
    }
}