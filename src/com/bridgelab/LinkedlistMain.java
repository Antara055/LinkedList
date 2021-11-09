package com.bridgelab;

public class LinkedlistMain {
    //main method
    public static void main(String[] args){
        System.out.println("Let's create limkedlist");
      //Add Data at head or to begin in linked list
        System.out.println("Add Nodes");
        LinkedlistOparation.addData();
      //Add Data at tail or end in linked list
        System.out.println("Append Nodes");
        LinkedlistOparation.append();
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