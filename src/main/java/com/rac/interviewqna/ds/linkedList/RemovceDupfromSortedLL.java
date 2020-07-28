package com.rac.interviewqna.ds.linkedList;

public class RemovceDupfromSortedLL {


    public static void main(String[] args) {

       Node head= createLinkedlist();
        print(head);

       Node output= removeDup(head);
        print(output);



    }

   // 1-->2-->2---3>--4--->5-->5
    public static Node removeDup(Node head) {
        if (head == null) {
            return head;
        }

        Node currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.data != currentNode.data) {
                currentNode = currentNode.next;
            } else {
                currentNode.next = currentNode.next.next;
            }

        }
        return head;
    }
    public static void print(Node output){

        Node curr=output;
        while(curr!=null)
        {
            System.out.print(curr.data+"----->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    // 1->2->2->3->4->5;

    public static Node createLinkedlist(){

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(5);
        head.next.next.next.next.next.next=new Node(5);
        return head;

    }


}

class NodeForLL{

    int data;
    Node next;

    public  NodeForLL(int data) {
        this.data=data;
        this.next=null;
    }
}
