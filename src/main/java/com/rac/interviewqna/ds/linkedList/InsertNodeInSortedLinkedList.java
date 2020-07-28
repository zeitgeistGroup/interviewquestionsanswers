package com.rac.interviewqna.ds.linkedList;

public class InsertNodeInSortedLinkedList {

    public static void main(String[] args) {

        Node head =createLinkedList();

        int data=11;

        print(head);

        Node output= insertNode(head,data);

        print(output);

    }

    public static Node insertNode( Node head,  int data){

        Node newNode= new Node(data);
        Node currentNode=head;
        Node previous=null;
        if(currentNode!=null && currentNode.data>newNode.data){
            newNode.next=head;
            head=newNode;
            return head;
        }

        while(currentNode!=null&& currentNode.data<newNode.data){
            previous=currentNode;
            currentNode=currentNode.next;
        }


        if(currentNode==null){
            previous.next=newNode;
            return head;
        }

        previous.next=newNode;
        newNode.next=currentNode;

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


    //1-->8-->10--->15

    public static Node  createLinkedList(){

        Node head=new Node(1);
        head.next=new Node(8);
        head.next.next=new Node(10);
        head.next.next.next=new Node(15);
        return head;

    }

}

class NodeSLL{

    int data;
    Node next;

    public NodeSLL(int data){

        this.data=data;
        this.next=null;


    }

}


