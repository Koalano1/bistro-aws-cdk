package com.myorg.util;

public class DataUtil {
    public static void requireNonEmptyOrNull(String param, String message){
        if (param == null || param.isBlank()){
            throw new IllegalArgumentException(message);
        }
    }

}
