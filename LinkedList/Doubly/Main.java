package com.timothy.LinkedList.Doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        //insert first
        doublyLinkedList.insertFirst(5);
        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(1);
        doublyLinkedList.insertFirst(10);

        doublyLinkedList.display();
        System.out.println();
        //display reverse
        doublyLinkedList.displayReverse();
        System.out.println();
        //insert last
        doublyLinkedList.insertLast(67);
        doublyLinkedList.display();
        System.out.println();
        //insert at index
        doublyLinkedList.insertAtIndex(96,3);
        doublyLinkedList.display();
        //delete first
        doublyLinkedList.deleteFirst();
        doublyLinkedList.display();
        System.out.println();
        //delete last
        doublyLinkedList.deleteLast();
        doublyLinkedList.display();
        System.out.println();
        //delete at index
        doublyLinkedList.deleteAtIndex(2);
        doublyLinkedList.display();
        System.out.println();
    }
}
