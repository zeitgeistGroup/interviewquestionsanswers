package com.rac.interviewqna.ds.linkedList;

public class ReverseSinglyLinkedList {

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

    /**
     * previous,next and current played a role here
     *
     * @param head
     * @return
     */

    public SinglyLinkedListNode reverseSinglyLinkedList(SinglyLinkedListNode head){

        //if head null then no node the return head
        if (head==null) return head;

        //set current ,previous and next
        SinglyLinkedListNode currentNode=head;
        SinglyLinkedListNode next=null;
        SinglyLinkedListNode previous=null;

        while(currentNode!=null){
            next=currentNode.next;
            currentNode.next=previous;
            previous=currentNode;
            currentNode=next;

        }


        return previous;

    }



        public static void main(String[] args) {

            ReverseSinglyLinkedList reverseSinglyLinkedList=new ReverseSinglyLinkedList();
            SinglyLinkedListNode node1=new SinglyLinkedListNode(1);
            SinglyLinkedListNode node2=new SinglyLinkedListNode(2);
            SinglyLinkedListNode node3=new SinglyLinkedListNode(3);
            SinglyLinkedListNode node4=new SinglyLinkedListNode(4);
            SinglyLinkedListNode node5=new SinglyLinkedListNode(5);



            reverseSinglyLinkedList.head=node1;
            node1.next=node2;
            node2.next=node3;
            node3.next=node4;
            node4.next=node5;
            SinglyLinkedListNode current= reverseSinglyLinkedList.head=node1;

            System.out.println("normal list");
            reverseSinglyLinkedList.print(current);
            // 1-->2-->3-->null
            SinglyLinkedListNode ringlyLinkedListNodeResult= reverseSinglyLinkedList.reverseSinglyLinkedList(reverseSinglyLinkedList.head);

            System.out.println("revers list");
            reverseSinglyLinkedList.print(ringlyLinkedListNodeResult);
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






