package ArrayList;
import java.util.*;

public class seven {

    //Assignment Questions: 1
    //Monotonic ArrayList

    // public boolean isMonotonic(ArrayList<Integer> A) {
    //     boolean inc = true;
    //     boolean dec = true;
    //     for(int i = 0; i<A.size()-1; i++){
    //         if(A.get(i) > A.get(i+1))
    //         inc = false;
    //         if(A.get(i) < A.get(i+1)) 
    //         dec = false;
    //     }
    //     return inc || dec;
    // }



    //Most Frequent Numbers

    public int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int [1000];

        for(int i = 0; i<nums.size()-1; i++){
            if(nums.get(i) == key){
                result[nums.get(i+1)-1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i<1000; i++){
            if(result[i] > max) {
                max = result[i];
                ans = i+1;
            }
        }

        return ans;
    }
    
}
