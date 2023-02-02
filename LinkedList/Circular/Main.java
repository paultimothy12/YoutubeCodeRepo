package com.timothy.LinkedList.Circular;

public class Main {
    public static void main(String[] args) {
        //Circular Singly Linked List
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

        circularSinglyLinkedList.insert(10);
        circularSinglyLinkedList.insert(5);
        circularSinglyLinkedList.insert(3);
        circularSinglyLinkedList.insert(1);
        circularSinglyLinkedList.display();

        circularSinglyLinkedList.delete(10);
        circularSinglyLinkedList.display();

        circularSinglyLinkedList.deleteIndex(1);
        circularSinglyLinkedList.display();

        // Circular Doubly Linked List
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();

        circularDoublyLinkedList.insert(5);
        circularDoublyLinkedList.insert(4);
        circularDoublyLinkedList.insert(3);
        circularDoublyLinkedList.insert(2);
        circularDoublyLinkedList.display();

        circularDoublyLinkedList.delete(3);
        circularDoublyLinkedList.display();


    }
}
