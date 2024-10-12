package LinkedList;

import java.util.LinkedList;

import java.util.*;

public class three {

    // public int itrSearch(int key){ //O(N)
    //     Node temp = head;
    //     int i  = 0;

    //     whole(temp!= null){
    //         if(temp.data==key){  //key found
    //             return i;

    //     }
    //     temp = temp.next;
    //     i++;
        

    //     }

    //     // key not found
    //     return -1; 
    // }

    // public static void main(String[] args) {
    //     LinkedList ll = new LinkedList();
    //     ll.addFirst(2);
    //     ll.addFirst(1);
    //     ll.addLast(4);
    //     ll.addLast(5);
    //     ll.add(2,3);

    //     ll.print();   //1->2->3->4->5
    // }
    

    // System.out.println(ll.itrSearch(3));
    // System.out.println(ll.itrSearch(10));


    // Reverse a linkedList

    //   public void reverse(){    //O(n);
    //     Node prev = null;
    //     Node curr = tail = head;
    //     Node next;

    //     while(curr != null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     head = prev;

    //   }

    //   public static void main(String[] args) {
    //     LinkedList ll = new LinkedList();
    //     ll.addFirst(2);
    //     ll.addFirst(1);
    //     ll.addLast(4);
    //     ll.addLast(5);
    //     ll.add(2,3);

    //     ll.print();
    //     ll.reverse();
    //     ll.print();

    //   }
     

    //Find and reverse nth Node from End

    // public void deleteNthfromEnd(int n){
    //     int sz = 0;
    //     Node temp = head;
    //     while(temp != null){
    //         temp = temp.next;
    //         sz++;
    //     }

    //     if(n == sz) {
    //         head = head.next; //removeFirst
    //         return;
    //     }

    //     //sz -n
    //     int i = 1;
    //     int iToFind  = sz-n;
    //     Node prev = head;
    //     while(i< iToFind){
    //         prev = prev.next;
    //         i++;
    //     }

    //     prev.next = prev.next.next;
    //     return;
    // }

    // public static void main(String[] args) {

    //         LinkedList ll = new LinkedList();
    //     ll.addFirst(2);
    //     ll.addFirst(1);
    //     ll.addLast(4);
    //     ll.addLast(5);
    //     ll.add(2,3);

    //     ll.print();
    //      ll.deleteNthfromEnd(3);
    //      ll.print();

    
    // }


    // to check for pallindrome

    //Slow-Fast Appproach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome(){

        if(head == null || head.next!= null){
            return true;
        }

        //step 1 = findMid

        Node midNode =  findMid(head);


        // step 2 = reverse 2nd half

        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr ! = null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // step 3 =  check left half and right half

        while(right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }


    }

    public static void main(String[] args) {

            LinkedList ll = new LinkedList();
        ll.addFirst(1);
        
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        System.out.println(ll.checkPalindrome());

    }

    
}
