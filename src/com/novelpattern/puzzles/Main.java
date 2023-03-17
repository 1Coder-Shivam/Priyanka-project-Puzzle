package com.novelpattern.puzzles;

import com.novelpattern.puzzles.linkedlist.LinkedList;
import com.novelpattern.puzzles.object.Node;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Get Fifth from End");
        LinkedList linkedList = new LinkedList();
        System.out.println("Enter the number of nodes:");
        Scanner sc = new Scanner(System.in);
        int numberOfNodes = sc.nextInt();
        while (numberOfNodes < 5) {
            System.out.println("Error: the linked list must have at least 5 nodes.");
            System.out.println("Enter the number of nodes:");
            numberOfNodes = sc.nextInt();
        }

        System.out.println("Enter the node values:");
        for (int i = 0; i < numberOfNodes; i++) {
            int value = sc.nextInt();
            linkedList.insert(value);
        }
        int fifthFromTail = linkedList.fifthFromTail();
        System.out.println("Fifth element from last: "+ fifthFromTail);
    }


}
