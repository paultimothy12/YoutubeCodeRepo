package com.timothy.LinkedList.Singly;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    public int size;

    SinglyLinkedList(){
        this.size=0;
    }
    public void insertFirst(int value) {
        System.out.println("Insert First");
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        System.out.println("Insert Last");
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node newNode = new Node(val);

        tail.next = newNode;
        tail = newNode;
        size++;

    }

    public void insertAtIndex(int val, int index){
        System.out.println("Inserting At Index = "+index);
        if(head==null) {
            System.out.println("insertAtIndex -> Empty Linked List");
            return;
        }
        if(index>size-1){
            System.out.println("insertAtIndex -> Index Not Available,Linked List Size = "+size);
            return;
        }

        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node curNode = head;
        for (int i=1;i<index;i++){
            curNode =curNode.next;
        }
        Node delNode =curNode.next;
        Node newNode = new Node(val);

        curNode.next=newNode;
        newNode.next=delNode.next;

        size++;
    }
    public void deleteFirst(){
        System.out.println("Delete First");
        if(head==null){
            System.out.println("deleteFirst -> LL Empty, Please Add Values and then Initiate DeleteFirst");
            return;
        }
        head=head.next;
        if(head==null){
            tail = null;
        }

        size--;
    }

    public void deleteLast(){
        System.out.println("Delete Last");
        if(size==0){
            System.out.println("deleteLast -> LL Empty, Please Add Values and then Initiate DeleteLast");
        }

        Node delCursor=head;
        for(int i =1;i<size-2;i++){
            delCursor=delCursor.next;
        }

        delCursor.next=null;
        tail=delCursor;

        size--;
    }
    public void deleteAtIndex(int index){
        System.out.println("Delete At Index = "+index);
        if(head==null){
            System.out.println("deleteAtIndex -> Empty LL, Cannot Perform Deletion");
            return;
        }
        if(index>size){
            System.out.println("deleteAtIndex -> Unreachable Index, Cannot Perform Deletion");
            return;
        }
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size){
            deleteLast();
            return;
        }

        Node delCursor = head;
        for(int i=1;i<index;i++){
            delCursor=delCursor.next;
        }
        Node Temp=delCursor.next;
        delCursor.next=Temp.next;

        size--;
    }
    public void display(){
        System.out.println("Displaying LL");
        if(head==null){
            System.out.println("display -> No Elements in LL");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp= temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
