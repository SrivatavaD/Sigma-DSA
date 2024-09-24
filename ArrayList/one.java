

// package ArrayList;

import java.util.*;

//ArrayList example to add two int in arrayList

public class one {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);  // time - O(1) :- Constant Time 
        list.add(2);
        list.add(3);

        list.add(1, 9); //O(N)

        System.out.println(list);

        System.out.println(list.size()); //to find the size of the arrayList

        // iterating in the arrayList

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

        System.out.println();

        

        //Get Operations -O(1)

        // int element = list.get(2);
        // System.out.println(element);

        //Delete operation O(N) :- Linear Time

        // list.remove(2);
        // System.out.println(list);

        //Set O(N) :- Linear Time

        // list.set(2,10);
        // System.out.println(list);

        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));




    }

}
