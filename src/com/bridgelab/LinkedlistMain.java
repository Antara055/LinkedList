package com.bridgelab;

public class LinkedlistMain {
    public static void main(String[] args){
        System.out.println("Let's create limkedlist");
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