package com.carfix.utils;

/**
 * Created by Administrator on 2016-05-24.
 */
public class StringTools {

    public static boolean isNotBlank(String str){
        if(str!=null && !"".equals(str)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isBlank(String str){
        if(str==null || "".equals(str)){
            return true;
        }else{
            return false;
        }
    }
}
