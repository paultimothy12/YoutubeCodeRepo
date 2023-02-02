package com.timothy.LinkedList.Doubly;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    public int size;
    public DoublyLinkedList() {
        this.size=0;
    }

    public void insertFirst(int Value){
        System.out.println("Insert First");
        Node newNode = new Node(Value);
        newNode.next=head;
        newNode.previous=null;

        if(head!=null){
            head.previous=newNode;
        }
        head = newNode;
        size+=1;
    }
    public void insertLast(int Value){
        System.out.println("Insert Last");
        Node newNode = new Node(Value);
        Node temp= head;
        while(temp!=null){
            tail=temp;
            temp= temp.next;
        }
        newNode.previous=tail;
        tail.next=newNode;
        tail=newNode;
        size+=1;
    }
    public void insertAtIndex(int value,int index){
        System.out.println("Insert At Index");
        Node curNode = head;
        for(int i =1;i<index;i++){
            curNode = curNode.next;
        }
        Node temp=curNode.next;

        Node newNode=new Node(value);

        curNode.next=newNode;
        newNode.previous=curNode;
        newNode.next=temp;
        temp.previous=newNode;
        size+=1;
    }
    public void deleteFirst(){
        System.out.println("Delete First");
        if(head==null){
            System.out.println("Empty DLL");
        }
        head=head.next;
        size-=1;
    }
    public void deleteLast(){
        System.out.println("Delete Last");
        Node temp= head;
        while(temp!=null){
            tail=temp;
            temp= temp.next;
        }
        tail=tail.previous;
        tail.next=null;
        size-=1;
    }
    public void deleteAtIndex(int index){
        System.out.println("Delete At Index = "+index);
        if(index==size-1){
            deleteLast();
            return;
        }
        if(index==0){
            deleteFirst();
            return;
        }
        Node curNode= head;
        for(int i =1;i<index;i++){
            curNode=curNode.next;
        }
        Node temp=curNode.next;

        curNode.next=temp.next;
        temp.next.previous=curNode;
        size-=1;
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
        System.out.print("End");
        System.out.println();
    }
    public void displayReverse(){
        System.out.println("Displaying LL in Reverse Order");
        Node revTemp=null;

        Node temp = head;
        while(temp!=null){
            revTemp=temp;
            temp = temp.next;
        }
        while (revTemp != null) {
            System.out.print(revTemp.value + " -> ");
            revTemp = revTemp.previous;
        }
        System.out.print("Start");
        System.out.println();
    }
    static class Node{
        private int value;
        private Node next;
        private Node previous;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
