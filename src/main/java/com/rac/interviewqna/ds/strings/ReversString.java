package com.rac.interviewqna.ds.strings;

import com.sun.org.apache.xpath.internal.SourceTree;

public class ReversString {


    public static void main(String[] args) {

        String input="hello";
        String result= reverseString(input);
        System.out.println(result);
    }
//olleh
    private static String reverseString(String input) {

        if(input==null){
          return   "";
        }
        StringBuilder test=new StringBuilder();

        for(int i=input.length()-1;i>=0;i--){

            test.append(input.charAt(i));

        }
       return  test.toString();
    }
}
