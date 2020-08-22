package com.rac.interviewqna.ds.strings;

import java.util.HashMap;
import java.util.Map;

public class MostRepetedCharacterInString {

    public static void main(String[] args) {

        String input="Helllllllooooo|";

        Character ch=mostRepetedCharacterInString(input);
        System.out.println(ch);

    }

    private static Character mostRepetedCharacterInString(String input) {

        if(input==null){
            return ' ';
        }

        HashMap<Character,Integer> map=new HashMap<>();

        for(char item: input.toCharArray()){

            if(map.containsKey(item)){
                 map.put(item,map.get(item)+1);
            }else{
                map.put(item,1);
            }
        }


        int max=0;
        char result=' ';
        for(char item:map.keySet()){
           if(map.get(item)>max){
              max=map.get(item);
               result=item;

            }

        }
        return result;

    }
}
