package ArrayList;
import java.util.*;

public class five {
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     //brute force for the problem solving 
    //     for(int i = 0;  i<height.size(); i++){
    //         for(int j = i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-1;
    //             int currWater = ht * width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;

    // }

    

    // public static void main(String[] args) {
    //     ArrayList<Integer> height = new ArrayList<>();
    //     height.add(1);
    //     height.add(8);
    //     height.add(6);
    //     height.add(2);
    //     height.add(5);
    //     height.add(4);
    //     height.add(8);
    //     height.add(3);
    //     height.add(7);
        
    //     System.out.println(storeWater(height));
    // }

    // 2 pointer approach for the same having time complexity:- liner O(n).

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp ) {
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater, currWater);
            //update ptr
            if(height.get(lp) < height.get(rp)){
                lp++; 

            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
            ArrayList<Integer> height = new ArrayList<>();
            height.add(1);
            height.add(8);
            height.add(6);
            height.add(2);
            height.add(5);
            height.add(4);
            height.add(8);
            height.add(3);
            height.add(7);
            
            System.out.println(storeWater(height));
        }
    
    
}
