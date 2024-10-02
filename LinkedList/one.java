package LinkedList;

import java.util.*;

public class one {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;

    //methods

    // add();
    // remove();
    // print();
    // search();

    //adding first

    public void addFirst(int data){
        //step 1:- create new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2:- newNode next = head
        newNode.next = head;  //link

        //Step 3:- head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
}

// time compelxity:-  O(1):- constant time of both the add first and add last.
