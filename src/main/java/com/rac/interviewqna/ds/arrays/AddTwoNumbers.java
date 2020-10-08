package com.rac.interviewqna.ds.arrays;

public class AddTwoNumbers {

   static class Node{
        Integer data;
        Node next;

        public  Node(int data){
            this.data=data;
        }


    public static void main(String[] args) {



        Node inputHead1=new Node(2);
        inputHead1.next=new Node(4);
        inputHead1.next.next=new Node(3);

        Node inputHead2=new Node(5);
        inputHead2.next=new Node(6);
        inputHead2.next.next=new Node(4);



       Node outputHead= addTwoNumbers(inputHead1,inputHead2);

    }

     //       342=====> 2-->4-->3
    ////        465=====> 5-->6-->4

   //         708

    private static Node addTwoNumbers(Node inputHead1, Node inputHead2) {

        Node outputHead=null;
        int carry=0;
        Node tmp=null;
        Node pre=null;

        while(inputHead1!=null || inputHead2!=null){

           Integer sum= carry+(inputHead1==null?0:inputHead1.data) +(inputHead2==null?0:inputHead2.data);
           carry= (sum>=10)?1:0;
           sum=sum%10;

           tmp=new Node(sum);

            if(outputHead==null){
                outputHead=tmp;
            }else{
                pre.next=tmp;
               // outputHead=main;
            }
            pre=tmp;
           if(inputHead1!=null) inputHead1=inputHead1.next;
           if(inputHead2!=null) inputHead2=inputHead2.next;



        }
        if(carry==1){
            tmp.next=new Node(carry);
        }

        return outputHead;
    }



}






}
