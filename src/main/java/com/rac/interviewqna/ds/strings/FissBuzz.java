package com.rac.interviewqna.ds.strings;

public class FissBuzz {


    public static void main(String[] args) {


        createFizzBuzz(15);


    }

    private static void createFizzBuzz(int n) {


        for (int i = 1; i <= n; i++) {
            StringBuilder b = new StringBuilder();
            if (i % 3 == 0 && i%5==0) {

                System.out.println(b.append("FizzBuzz"));
            }else if (i % 3 == 0) {
                System.out.println(b.append("Fizz"));
            }else if(i%5==0){
                System.out.println(b.append("Buzz"));
            }else{
                System.out.println(i);
            }


        }
    }
}
