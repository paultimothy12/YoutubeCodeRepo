package com.timothy.LeetCode;

//Problem 21
//LeetCode Solution:

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(0);
//        ListNode tail = dummy;
//
//        while (l1 != null && l2 != null) {
//            if (l1.value < l2.value) {
//                tail.next = l1;
//                l1 = l1.next;
//            } else {
//                tail.next = l2;
//                l2 = l2.next;
//            }
//            tail = tail.next;
//        }
//
//        if (l1 != null) {
//            tail.next = l1;
//        } else {
//            tail.next = l2;
//        }
//
//        return dummy.next;
//    }


//My Own Implementation SLL - merge two sorted list
class SinglyLinkedList {
    private Node head;
    private Node tail;
    public int size;

    SinglyLinkedList() {
        this.size = 0;
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

    public void insertLast(int value) {
        System.out.println("Insert Last");
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node newNode = new Node(value);

        tail.next = newNode;
        tail = newNode;
        size++;

    }

    public void insertAtIndex(int value, int index) {
        System.out.println("Inserting At Index = " + index);
        if (head == null) {
            System.out.println("insertAtIndex -> Empty Linked List");
            return;
        }
        if (index > size - 1) {
            System.out.println("insertAtIndex -> Index Not Available,Linked List Size = " + size);
            return;
        }

        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        Node curNode = head;
        for (int i = 1; i < index; i++) {
            curNode = curNode.next;
        }
        Node delNode = curNode.next;
        Node newNode = new Node(value);

        curNode.next = newNode;
        newNode.next = delNode.next;

        size++;
    }

    public void deleteFirst() {
        System.out.println("Delete First");
        if (head == null) {
            System.out.println("deleteFirst -> LL Empty, Please Add Values and then Initiate DeleteFirst");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }

        size--;
    }

    public void deleteLast() {
        System.out.println("Delete Last");
        if (size == 0) {
            System.out.println("deleteLast -> LL Empty, Please Add Values and then Initiate DeleteLast");
        }

        Node delCursor = head;
        for (int i = 1; i < size - 2; i++) {
            delCursor = delCursor.next;
        }

        delCursor.next = null;
        tail = delCursor;

        size--;
    }

    public void deleteAtIndex(int index) {
        System.out.println("Delete At Index = " + index);
        if (head == null) {
            System.out.println("deleteAtIndex -> Empty LL, Cannot Perform Deletion");
            return;
        }
        if (index > size) {
            System.out.println("deleteAtIndex -> Unreachable Index, Cannot Perform Deletion");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        }

        Node delCursor = head;
        for (int i = 1; i < index; i++) {
            delCursor = delCursor.next;
        }
        Node Temp = delCursor.next;
        delCursor.next = Temp.next;

        size--;
    }

    public void display() {
        System.out.println("Displaying LL");
        if (head == null) {
            System.out.println("display -> No Elements in LL");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public static void mergeSortedLL(SinglyLinkedList List1, SinglyLinkedList List2){

        System.out.println("Merging Sorted List");

        Node Node1 = List1.head;
        Node Node2 = List2.head;
        SinglyLinkedList Result = new SinglyLinkedList();

        while(Node1 !=null && Node2!=null){
            if(Node1.value < Node2.value){
                Result.insertLast(Node1.value);
                Node1= Node1.next;
            }
            else{
                Result.insertLast(Node2.value);
                Node2=Node2.next;
            }
        }
        while(Node1!=null){
            Result.insertLast(Node1.value);
            Node1 = Node1.next;
        }
        while(Node2!=null){
            Result.insertLast(Node2.value);
            Node2=Node2.next;
        }

        Result.display();
    }

    static class Node {
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

public class MergeTwoSortedList {
    public static void main(String[] args) {
        SinglyLinkedList List1 = new SinglyLinkedList();
        SinglyLinkedList List2 = new SinglyLinkedList();

        List1.insertLast(1);
        List1.insertLast(2);
        List1.insertLast(7);

        List2.insertLast(1);
        List2.insertLast(4);
        List2.insertLast(5);
        List2.insertLast(12);

        SinglyLinkedList.mergeSortedLL(List1,List2);
    }
}


