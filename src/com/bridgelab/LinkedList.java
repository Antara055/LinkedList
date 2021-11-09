package com.bridgelab;

public class LinkedList {
    Node head, tail;

    public void addToBegin(int data) {
        Node nnode = new Node(data);
        if (head == null) {
            head = tail = nnode;
        } else {
            Node temp = head;
            this.head = nnode;
            nnode.next = temp;
        }

    }
    public void append(int data) {
        Node nnode = new Node(data);
        if (head == null) {
            head = tail = nnode;
        } else {
            Node temp = tail;
            this.tail = nnode;
            temp.next = nnode;
        }

    }

    public void displayList() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}
