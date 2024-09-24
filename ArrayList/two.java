package ArrayList;

import java.util.ArrayList;

public class two {

    //to find the reverse of the number

    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // //Reverse Print

        // for(int i = list.size() -1; i>=0; i--){
        //     System.out.println(list.get(i) + " ");
        // }


        // to find the maximum of the arraylist

        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<list.size(); i++){
            // if(max< list.get(i)){
            //     max = list.get(i);
            // }

            max = Math.max(max, list.get(i));


        }
    }
    
}
