package com.bridgelab;

public class LinkedList {
    Node head, tail;

    public void push(int data) {
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
    public void insertNode(Node prev_node,int data) {
        if (prev_node == null) {
            System.out.println("Previous node cannot be Null");
        } else {
            Node nnode = new Node(data);
            nnode.next=prev_node.next;
            prev_node.next=nnode;
        }

    }
    public void pop(){
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            temp = null;

        }
    }
    public void lastpop() {
        Node temp = head;
        while (!temp.next.equals(tail)) {
            temp = temp.next;
        }
        this.tail = temp;
        temp.next = null;
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
