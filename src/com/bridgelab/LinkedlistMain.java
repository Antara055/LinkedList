package com.bridgelab;

public class LinkedlistMain {
    //main method
    public static void main(String[] args) {
        System.out.println("Let's create limkedlist");
        //Add Data at head or to begin in linked list
        System.out.println("Add Nodes");
        LinkedlistOparation.addData();
        //Add Data at tail or end in linked list
        System.out.println("Append Nodes");
        LinkedlistOparation.append();
        //Add data in between
        System.out.println("Insert in between");
        LinkedlistOparation.insert();
        //Delete first element
        System.out.println("Delete first element");
        LinkedlistOparation.deleteFirst();
        //Delete last element
        System.out.println("Delete last element");
        LinkedlistOparation.deleteLast();
        //Searching node by value
        System.out.println("Value(30) searhing");
        LinkedlistOparation.sechValue();
    }
}
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}