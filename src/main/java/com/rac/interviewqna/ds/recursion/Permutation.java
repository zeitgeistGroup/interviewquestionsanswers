package com.rac.interviewqna.ds.recursion;

public class Permutation {

    public static void main(String arg[]){
        Permutation permutation=new Permutation();
        permutation.getPermutations("ab".toCharArray(),0);
    }

    public void getPermutations(char[] inputString,int index){
        if(index==inputString.length-1){
            System.out.println(inputString);
            return ;
        }

        for(int i=index;i<inputString.length;i++){

            swap(inputString,i,index);
            getPermutations(inputString,index+1);
            swap(inputString,i,index);

        }

    }

    private void swap(char[] inputString,int first,int index){
        char temp=inputString[first];
        inputString[first]=inputString[index];
        inputString[index]=temp;


    }
}
