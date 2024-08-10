import java.util.*;
// public class seven {

//     //In this module We have completed Some practice problems of arrays 

//     //Given an integer arrays num, return true if any value appears at least 
//     // twice in the array and return false if every element is distinct.

//     public boolean containsDuplicate(int[] nums) {
//         for(int i = 0 ; i<nums.length ; i++){
//             for(int j=i+1; j<nums.length; j++) {
//                 if( nums[i] == nums[j] ) {
//                     return true;
//                 }
//             }
//         }
//         return false;
        
//     }
//     public static void main(String[] args) {
//         int arr [] = {1,2,3,1};
//         System.out.println(containsDuplicate(nums));
//     }
    


    
// }

import java.util.Arrays;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        // Iterate through the sorted array and check for consecutive duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        // No duplicates found, return false
        return false;
    }

    // Main method to test the containsDuplicate function
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums1)); // Output: false

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums2)); // Output: true

        int[] nums3 = {7, 8, 9, 9, 10};
        System.out.println(solution.containsDuplicate(nums3)); // Output: true

        int[] nums4 = {};
        System.out.println(solution.containsDuplicate(nums4)); // Output: false

        int[] nums5 = {1};
        System.out.println(solution.containsDuplicate(nums5)); // Output: false
    }
}

