package com.rac.interviewqna.ds.strings;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {

        String input1="ABCD";

        String input2="BADZ";

        boolean isAnagrame=isAnagrame1(input1,input2);
        System.out.println(isAnagrame);
    }

    private static boolean isAnagrame(String input1, String input2) {

        if(input1.length()!=input2.length()){
            return false;
        }

        Set<Character> set=new HashSet<>();

        for(char item:input1.toCharArray())
        {
            set.add(item);
        }

        for(char item:input2.toCharArray()){
           if(!set.contains(item)){
               return false;
           }
        }
        return true;

    }

    private static boolean isAnagrame1(String input1, String input2) {

        if(input1.length()!=input2.length()){
            return false;
        }

        char[] char1=input1.toCharArray();
        char[] char2=input2.toCharArray();
        Arrays.sort(input2.toCharArray());
        Arrays.sort(input1.toCharArray());
       return  Arrays.equals(char1,char2);


    }

}
