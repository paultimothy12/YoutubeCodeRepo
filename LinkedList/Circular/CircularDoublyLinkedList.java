package com.timothy.LinkedList.Circular;

public class CircularDoublyLinkedList {
    private Node head;
    private Node tail;
    public CircularDoublyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public void insert(int value) {
        System.out.println("Insert");
        Node newNode = new Node(value);
        newNode.next=null;
        newNode.previous=null;

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.previous=tail;
        newNode.next = head;
        tail = newNode;
    }
    public void delete(int value) {
        System.out.println("Delete");
        Node temp = head;
        if (temp == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (temp.value == value) {
            head = head.next;
            head.previous=tail;
            tail.next = head;
            return;
        }

        do {
            Node curNode = temp.next;
            if (curNode.value == value) {
                temp.next = curNode.next;
                temp.previous=curNode.previous;
                break;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void display() {
        System.out.println("Displaying LL");
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                if (temp.next != null) {
                    temp = temp.next;
                }
            } while (temp != head);
        }
        System.out.println("Head Node");
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
