package com.rac.interviewqna.ds.linkedList;

public class NthElementFromLastSinglyLinkedList {


    //head node of singly linked list
    private SinglyLinkedListNode head;

    //node of singly linked list
    private static class SinglyLinkedListNode {
        private int data;
        private SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedListNode nthElementFromLastSinglyLinkedList(SinglyLinkedListNode head,int n){

        SinglyLinkedListNode mainPointer=head;
        SinglyLinkedListNode refrencePointer=head;

        if(head==null)
            return head;



        for(int i=0;i<n;i++){

            refrencePointer=refrencePointer.next;

        }

        while(refrencePointer!=null){
            refrencePointer=refrencePointer.next;
            mainPointer=mainPointer.next;


        }

        return mainPointer;






    }



    public static void main(String[] args) {

        NthElementFromLastSinglyLinkedList nthElementFromLastSinglyLinkedList=new NthElementFromLastSinglyLinkedList();
        SinglyLinkedListNode node1=new SinglyLinkedListNode(1);
        SinglyLinkedListNode node2=new SinglyLinkedListNode(2);
        SinglyLinkedListNode node3=new SinglyLinkedListNode(3);
        SinglyLinkedListNode node4=new SinglyLinkedListNode(4);
        SinglyLinkedListNode node5=new SinglyLinkedListNode(5);



        nthElementFromLastSinglyLinkedList.head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        SinglyLinkedListNode current= nthElementFromLastSinglyLinkedList.head;

        System.out.println("normal list");
        nthElementFromLastSinglyLinkedList.print(current);
        // 1-->2-->3-->null
        SinglyLinkedListNode ringlyLinkedListNodeResult= nthElementFromLastSinglyLinkedList.nthElementFromLastSinglyLinkedList(nthElementFromLastSinglyLinkedList.head,2);

        System.out.println("revers list");
        nthElementFromLastSinglyLinkedList.print(ringlyLinkedListNodeResult);
        //3--->2-->1-->null
    }

    private  void print(SinglyLinkedListNode current) {
        while(current!=null){
            System.out.print(current.data+" -->");
            current=current.next;
        }
        System.out.println("null");

    }
}
