

// below written is the code for merge sort in linkedList


public class five {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    // Add node to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Find the middle of the linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Mid node
    }

    // Merge two sorted linked lists
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // Merge Sort
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the linked list
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively split and merge the list
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge the two halves
        return merge(newLeft, newRight);
    }

    // Print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        five ll = new five();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        // List before sorting: 5 -> 4 -> 3 -> 2 -> 1
        System.out.println("Before Sorting:");
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        // List after sorting: 1 -> 2 -> 3 -> 4 -> 5
        System.out.println("After Sorting:");
        ll.print();
    }
}
