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
    //delete first element
    public static void deleteFirst(){
        LinkedList list=new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.pop();
        list.displayList();
    }
    //deleting last element
    public static void deleteLast() {
        LinkedList list=new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.lastpop();
        list.displayList();
    }
    //serching by value
    public static void sechValue() {
        LinkedList list=new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.search(30);
    }
    //insert data at mentioned position
    public static void insertDataInMentionedNode() {
        LinkedList list = new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.insertNode(list.head.next, 40);
        list.displayList();
    }
    //delete data from mentioned position
    public static void deleteDataFromMentionedNode() {
        LinkedList list = new LinkedList();
        list.push(70);
        list.push(30);
        list.push(40);
        list.push(56);
        System.out.println("before deleting the element the list is");
        list.displayList();
        list.deleteNode(40);
        System.out.println("after deleting the element the list is");
        list.displayList();
    }
    //sorting the list
    public static void sortList() {
        LinkedList list = new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.push(40);
        System.out.println("Before sorting");
        list.displayList();
        System.out.println();
        list.sort();
        System.out.println("After Sorting");
        list.displayList();
    }
}
