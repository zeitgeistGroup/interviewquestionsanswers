package com.rac.interviewqna.ds.stacks;

import java.util.Stack;

public class SolutionValidParenthes {

    /**
     * Valid Parentheses problem
     *
     * 1.input all opening bracket in stack
     * 2.any close bracket comes then get peek from stack and verify,
     * it is corresponding  to the open bracket or not if yes the pop from stack else
     * 3.check is stack is empty or not
     *
     * @param str
     * @return
     */

   boolean  isValid(String str) {

       if (str.isEmpty() || str == null) return false;
       Stack<Character> stack = new Stack();


       for (char ch : str.toCharArray()) {
           if (ch == '{' || ch == '(' || ch == '[') {
               stack.push(ch);
           } else {

               if (!stack.isEmpty() && stack.peek() == '(' && ch == ')') {
                   stack.pop();
               } else if (!stack.isEmpty() && stack.peek() == '{' && ch == '}') {
                   stack.pop();

               } else if (!stack.isEmpty() && stack.peek() == '[' && ch == ']') {
                   stack.pop();
               } else {
                   return false;
               }
           }

       }
       return stack.isEmpty();
   }





    public static void main(String[] args) {
        SolutionValidParenthes solutionValidParenthes=new SolutionValidParenthes();
        System.out.println("{()}  :"+solutionValidParenthes.isValid("{()}"));// valid: true
        System.out.println("{(())}  :"+solutionValidParenthes.isValid("{(())}"));// valid: true
        System.out.println("[{()()}]  :"+solutionValidParenthes.isValid("[{()()}]"));// valid: true
        System.out.println("[{()  :"+solutionValidParenthes.isValid("[{()"));// valid: false
        System.out.println("{(}  :"+solutionValidParenthes.isValid("{(}"));// valid: false


    }


}
