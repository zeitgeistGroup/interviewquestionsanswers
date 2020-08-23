package com.rac.interviewqna.ds.strings;

public class Palindrome {


    public static void main(String[] args) {

        String input="radar";

        boolean value=ispalindrome1(input);
        System.out.println(value);


    }

    private static boolean ispalindrome(String input) {
        if (input==null){
            return true;
        }

        int start=0;
        int end=input.length()-1;
        while(start<end){

            if(input.charAt(start++)!=input.charAt(end--))
                return false;


        }
        return true;
    }

    private static boolean ispalindrome1(String input) {
        if(input==null){
            return true;
        }

        StringBuilder builder=new StringBuilder(input);
        builder.reverse();
        if(input.equals(builder.toString())){
            return true;
        }
        return false;
    }
}
