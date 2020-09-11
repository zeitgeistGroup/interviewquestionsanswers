package com.rac.interviewqna.ds.strings;

public class BinaryToDecimal {   public static void main(String[] args) {

    String input = "10101";
    int output = getDecimalValueFromString(input);
    System.out.println(output);
    System.out.println(Integer.parseInt(input,2));

}


    //  third*2^3+secound*2^1+first*2^0
    //      1*2^2+        1*2^1          +  1*2^0
    //         4             2                 1=7
    public static int getDecimalValueFromString(String input) {

        if (input == null || input.isEmpty())
            return 0;
        int base = 1;
        int output = 0;

        for (int i = input.length() - 1; i >= 0; i--) {

            if (input.charAt(i) == '1') {
                output += base;
            }
            base = base * 2;
        }

        return output;


    }
}
