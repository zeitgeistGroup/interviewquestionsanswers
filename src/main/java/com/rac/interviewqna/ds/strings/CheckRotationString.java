package com.rac.interviewqna.ds.strings;

public class CheckRotationString {



    public static void main(String[] args) {
        String input1="ABCD";
        String input2="DACB";

        System.out.println(checkRotationString(input1,input2));
    }

    private static boolean checkRotationString(String input1, String input2) {

        if(input1.length()!=input2.length()){
            return false;
        }

        if(!(input1+input1).contains(input2)){
            return false;
        }
        return true;
    }


}
