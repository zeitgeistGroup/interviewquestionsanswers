package com.rac.interviewqna;

import java.util.Stack;

/**
 *
 * Min Stack Problem
 *
 * This class is using for implementation of min_stack
 *
 * 1.main stack which will work normal
 * 2.min_stack stack which maintain the min value
 * 3.We need to tweak in push (if stack is empty and push
 * value is less then peek of the min_stack then we need to push it in min_stack)
 * and pop(when min element pop from main stack then we need to pop from min_stack as well) method
 */

public class SolutionMinStack {

   private  Stack<Integer> main;
   private  Stack<Integer> min_stack;

    public SolutionMinStack(){
        this.main =new Stack();
        this.min_stack= new Stack();
    }


    public void push( int e){

       if(min_stack.isEmpty()||e<=min_stack.peek()){
           min_stack.push(e);
       }
        main.push(e);

    }

    public void pop(){
         if(main.peek().equals(min_stack.peek())){
             min_stack.pop();
         }
         main.pop();
    }

    public int peek(){
        return main.peek();
    }

    public int  minElement(){
       return  min_stack.peek();
    }

    public static void main(String[] args) {

        SolutionMinStack solutionMinStack=new SolutionMinStack();
        solutionMinStack.push(-2);
        solutionMinStack.push(0 );
        solutionMinStack.push(-3);
        System.out.println(solutionMinStack.minElement());// -3
        solutionMinStack.pop();
        System.out.println(solutionMinStack.minElement());//-2

    }


}
