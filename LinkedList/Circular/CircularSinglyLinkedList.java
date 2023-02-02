package com.timothy.LinkedList.Circular;

public class CircularSinglyLinkedList {

    private Node head;
    private Node tail;

    public CircularSinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        System.out.println("Insert");
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
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
    public void deleteIndex(int index){
        System.out.println("Delete At Index = "+index);
        Node delCursor = head;
        for(int i=1;i<index;i++){
            delCursor=delCursor.next;
        }
        Node Temp=delCursor.next;
        delCursor.next=Temp.next;
        System.out.println();
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
            tail.next = head;
            return;
        }

        do {
            Node curNode = temp.next;
            if (curNode.value == value) {
                temp.next = curNode.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

