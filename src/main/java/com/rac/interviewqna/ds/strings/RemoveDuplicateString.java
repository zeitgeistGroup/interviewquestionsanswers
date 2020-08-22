package com.rac.interviewqna.ds.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {


    public static void main(String[] args) {


        String input="Hellooo!!";

        String str=removeDuplicates1(input);
        System.out.println(str);

    }

    private static String removeDuplicates1(String input) {

        if(input==null){
            return "";
        }

       Set<Character> set=new HashSet<>();
        StringBuilder result=new StringBuilder();
        for(char item:input.toCharArray()){

            if(!set.contains(item)){
                set.add(item);
                result.append(item);

            }
        }

        return result.toString();

    }

    private static String removeDuplicates(String input) {

        if(input==null){
            return "";
        }

        int[] ASSCI=new int[256];
        StringBuilder result=new StringBuilder();
        for(char item:input.toCharArray()){

            if(ASSCI[item]++<1){
               result.append(item);

            }
        }

        return result.toString();

    }
}
