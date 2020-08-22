package com.rac.interviewqna.ds.strings;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordOrderSentence {

    public static void main(String[] args) {

        String input = "  God will help you always believe in";

        String result= resreverseWordsOfTheSentance(input);
        System.out.println(result);
    }

    private static String resreverseWordsOfTheSentance(String input) {

        if (input==null){
            return "";
        }

       String[] inputWordwsArray= input.trim().split(" ");

       /* Collections.reverse(Arrays.asList(inputWordwsArray));
        return String.join(" ",inputWordwsArray);*/


       StringBuilder result=new StringBuilder();

       for (int i=inputWordwsArray.length-1;i>-0;i--){
           result.append(inputWordwsArray[i]+" ");
       }

       return result.toString().trim();

    }
}
