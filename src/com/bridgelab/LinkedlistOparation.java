package com.bridgelab;

public class LinkedlistOparation {
    //add data at head of linkedlist
    public static void addData(){
        LinkedList list = new LinkedList();
        list.addToBegin(70);
        list.addToBegin(30);
        list.addToBegin(56);
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

}
