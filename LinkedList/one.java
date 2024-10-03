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

    // public void addFirst(int data){
    //     //step 1:- create new Node
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = tail = newNode;
    //         return;
    //     }

    //     // step 2:- newNode next = head
    //     newNode.next = head;  //link

    //     //Step 3:- head = newNode
    //     head = newNode;
    // }

    // public void addLast(int data){
    //     Node newNode = new Node(data);
    //     if(head == null) {
    //         head = tail = newNode;
    //         return;
    //     }
    //     tail.next = newNode;
    //     tail = newNode;
    // }

    public void print(){
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print(); 
    }
}

// time compelxity:-  O(1):- constant time of both the add first and add last.
