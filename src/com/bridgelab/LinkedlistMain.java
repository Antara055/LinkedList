package com.bridgelab;

public class LinkedlistMain {
    public static void main(String[] args){
        System.out.println("Let's create limkedlist");
        //Add Data at head or to begin in linked list
        System.out.println("Add Nodes");
        LinkedlistOparation.addData();

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