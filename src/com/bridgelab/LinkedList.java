package com.bridgelab;

public class LinkedList {
    Node head, tail;
//adding data from head in Linkedlist
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
//adding data from tail in Linkedlist

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
//inserting data at mentioned position of Linkedlist

    public void insertNode(Node prev_node,int data) {
        if (prev_node == null) {
            System.out.println("Previous node cannot be Null");
        } else {
            Node nnode = new Node(data);
            nnode.next=prev_node.next;
            prev_node.next=nnode;
        }

    }
//deleting first element
    public void pop(){
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            temp = null;

        }
    }
//deleting last element
    public void lastpop() {
        Node temp = head;
        while (!temp.next.equals(tail)) {
            temp = temp.next;
        }
        this.tail = temp;
        temp.next = null;
    }
//dispkaying the list
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
//Searching node by value
    public void search(int value) {
        Node temp=head;
        int index=1;
        boolean flag=false;

        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            while (temp!=null){
                if(temp.data==value)
                {
                    System.out.println();
                    flag=true;
                    break;
                }
                else{
                    index++;
                    temp=temp.next;
                }

            }
            if (flag==true)
                System.out.println("Value found at index : "+(index-1));
            else
                System.out.println("Value not found");

        }
    }
//
    public void deleteNode(int data) {
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node tempNode = head;
        while (tempNode.next.data != data) {
            tempNode = tempNode.next;
        }
        Node previousNode = tempNode;
        Node nextNode = tempNode.next.next;
        previousNode.next = nextNode;
    }
}
