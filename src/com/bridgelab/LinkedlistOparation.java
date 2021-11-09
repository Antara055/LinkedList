package com.bridgelab;

public class LinkedlistOparation {
    //add data at head of linkedlist
    public static void addData(){
        LinkedList list = new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.displayList();
    }
    //add data at tail at linkedlist
    public static void append(){
        LinkedList list=new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.displayList();
    }
    //add data in between of linkedlist
    public static void insert(){
        LinkedList list=new LinkedList();
        list.push(70);
        list.push(56);
        list.insertNode(list.head,30);
        list.displayList();
    }

}
