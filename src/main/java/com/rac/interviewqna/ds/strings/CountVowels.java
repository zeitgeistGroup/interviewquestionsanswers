package com.rac.interviewqna.ds.strings;

public class CountVowels {


    public static void main(String[] args) {

        String input="Myname name is test";//hello/null

     int count=   getCountVowels(input);
        System.out.println(count);

    }

    private static int getCountVowels(String input) {

        if(input==null){
            return 0;
        }

        String[] inputStringsArray=input.trim().split("");
        int counter=0;
        String vowels="aeiou";

        for(int i=0;i<inputStringsArray.length;i++){

            for(char item: inputStringsArray[i].toLowerCase().toCharArray())
            {
               // if(vowels.contains(Character.getName(item)))
                if (vowels.indexOf(item)!=-1){
                    counter++;
                }
            }
        }

        return counter;
    }

}
