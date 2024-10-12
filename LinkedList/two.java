package LinkedList;

import java.util.*;

public class two {

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        } else if( size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        //prev: i = size-2
        Node prev = head;
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);

        ll.print();   

        ll.print();
        ll.removeFirst();
        ll.print();

        ll.removeLast();
       
    }
    
}
