package com.rac.interviewqna.ds.recursion;

public class PrintCounting {

    public static void main (String arg[]){
        PrintCounting printCounting  =new PrintCounting();
        printCounting.printCounting(5);
    }

    public void printCounting(int number){
        if(number==0)
            return;
        printCounting(number-1);
        System.out.println(number);

    }


}
