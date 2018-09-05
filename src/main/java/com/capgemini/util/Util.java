package com.capgemini.util;

public class Util {

    public boolean isNumeric(char c){
        return c >47 && c < 58;
    }

    public static boolean isNumeric2 (String value){
        boolean is = Boolean.TRUE;
        try{
            Integer.valueOf(value);
        }catch{
            is = Boolean.FALSE;
        }
        return is;
    }
}
