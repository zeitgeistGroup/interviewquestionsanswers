package com.rac.interviewqna.ds.hashing;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharFinder {


    public static void main(String[] args) {

        String input="a green apple";
        Character output=nonRepetingCharFinder(input);
        System.out.println(output);
    }

    private static Character nonRepetingCharFinder(String input) {

        Map<Character,Integer> map=new HashMap<>();

        for(Character c: input.trim().toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,0);
            }

        }

        for(Character c:input.trim().toCharArray()){
            if(map.get(c)<1){

                return c ;
            }
        }

        return Character.MIN_VALUE;

    }
}
