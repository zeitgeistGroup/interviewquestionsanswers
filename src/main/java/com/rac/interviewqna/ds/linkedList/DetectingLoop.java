package com.rac.interviewqna.ds.linkedList;

/**
 *
 *
 * Detecting  Loop in linked list
 */

public class DetectingLoop {
    public static void main(String[] args) {

   Node head=creataLinkedList();


        boolean isLoop = detectingLoop(head);

        System.out.println("is list has loop "+ isLoop);


    }

    public static boolean detectingLoop(Node head){

        Node slowPointer=head;
        Node fastPointer=head;

        while(fastPointer!=null &&fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;


            if(slowPointer==fastPointer){
                return true;
            }

        }

        return false;

    }


  //  1-->2-->--3-->4-->5
  //               |    |
  //               7----6
    public static Node  creataLinkedList(){

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(7);
        head.next.next.next.next.next.next.next=head.next.next.next;
        return head;

    }



}


class Node{

    int data ;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }


}
