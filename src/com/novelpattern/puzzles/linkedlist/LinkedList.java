package com.novelpattern.puzzles.linkedlist;

import com.novelpattern.puzzles.object.Node;

public class LinkedList {
    private Node head;
    private int size;


    //Constructor
    public LinkedList(){
        this.head = null;
        this.size=0;
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public int fifthFromTail(){
        Node current = head;
        Node fifthFromLast = head;
         for(int i=1;i<5;i++){
             if(current.getNext()==null){
                 return -1;
             }
             current= current.getNext();
         }

         while(current.getNext()!=null){
             current = current.getNext();
             fifthFromLast = fifthFromLast.getNext();
         }
         return fifthFromLast.getData();
    }
}
