package com.rac.interviewqna.ds.strings;

public class CapatilizeTheFirstCharacterOfWords {


    public static void main(String[] args) {

        String input="god is grate";

       String result= capatilizeTheFirstCharacterOfWords(input);
        System.out.println(result);

    }

    private static String capatilizeTheFirstCharacterOfWords(String input) {

        if(input==null){
            return "";
        }

        String[] words= input.trim().split(" ");


        for(int item=0;item<words.length;item++){

            words[item]=words[item].substring(0,1).toUpperCase()+words[item].substring(1).toLowerCase();

        }

        return  String.join(" ",words);
    }
}
