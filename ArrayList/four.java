package ArrayList;

import java.util.*;

public class four {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j<currList.size(); j++) {
                System.out.println(currList.get(j) + " ");

            }
            System.out.println();
        }


    }
    
}