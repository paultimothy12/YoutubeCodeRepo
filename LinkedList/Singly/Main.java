package com.timothy.LinkedList.Singly;


public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        //insert first
        ll.insertFirst(2);
        ll.insertFirst(100);
        ll.display();
        System.out.println();
        //insert last
        ll.insertLast(5);
        ll.display();
        System.out.println();
        //insert at index
        ll.insertAtIndex(1,0);
        ll.display();
        System.out.println();

        ll.insertAtIndex(100,5);
        ll.display();
        System.out.println();

        ll.insertAtIndex(10,1);
        ll.display();
        System.out.println();
        //delete first
        ll.deleteFirst();
        ll.display();
        System.out.println();
        //delete last
        ll.deleteLast();
        ll.display();
        System.out.println();

        ll.insertFirst(3);
        ll.insertFirst(7);
        ll.insertFirst(12);
        ll.display();
        System.out.println();
        //delete at index
        ll.deleteAtIndex(2);
        ll.display();
        System.out.println();
        ll.deleteAtIndex(0);
        ll.display();
    }
}
