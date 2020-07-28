package com.rac.interviewqna.ds.linkedList;

public class RemoveGivenKeyFromLinkedlist {

    public static void main(String[] args) {

        Node head=createLinkedlist();
        int removeData=1;
         print(head);
         Node output= removeGivenKey(head,removeData);
         print(output);


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

    public static Node removeGivenKey(Node head,int removeData){
        Node currentNode=head;
        Node previous=null;

        if(currentNode!=null && currentNode.data==removeData) {
            return currentNode.next;
        }

        while( currentNode!=null && currentNode.data!=removeData){
            previous=currentNode;
            currentNode=currentNode.next;
        }

        if(currentNode==null){
            return head;
        }

        previous.next=currentNode.next;

        return head;

    }

   // 1->2->3->4->5;

    public static Node createLinkedlist(){

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        return head;

    }
}

class SLLNode {
    int data;
    Node next;
    public SLLNode(int data){
        this.data=data;
        this.next=null;
    }

}
