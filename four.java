import java.util.*;
public class four {

    //Max subArray Sum (Brute Force)
    // public static void maxSubarraySum(int numbers[]){
    //     int  currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;

    //     for(int i = 0 ; i< numbers.length; i++){
    //         int start = i ;
    //         for(int j = i; j<numbers.length; j++){
    //             int end = j;
    //             currSum = 0 ;
    //             for(int k=start; k<=end; k++){ //print
    //                 //subarrays sum
    //                 currSum += numbers[k];
    //             }
    //             System.out.println(currSum);
    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
                
    //         }

    //     }
    //     System.out.println("max sum = " +maxSum);
    // }
    // public static void main(String[] args) {
    //     int numbers[] = {2,4,6,8,10};
    //     maxSubarraySum(numbers);
    // }
    //Time Complexity for this program will be O(n^3) ; Which is very bad 
    //So to maintain a better code with better time complexity next approach is
    //Written under 

    //

    //Prefix Sum Arrays (Same above question but with a different approach)

    // public static void maxSubarraySum(int numbers[]){
    //     int currSum = 0; 
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];

    //     prefix[0] = numbers[0];
    //     //calculate prefix array
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }

    //     for(int i = 0 ;i<numbers.length; i++) {
    //         int start = i; 
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             currSum =  start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

    //             if(maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("max sum = " + maxSum);
    // }
    // public static void main(String[] args) {
    //     int numbers[] = {1,-2,6,-1,3};
    //     maxSubarraySum(numbers);


    // }

    //Time Complexity for prefix sum approach is O(n^2) which is much better than last brute force approach
    //hence this more optimised solution

    //The more advanced algorithm for better and optimised solution is called as
    //kadane's Algorithm

    public static void maxSubarraySum(int numbers[]){
            int currSum = 0; 
            int maxSum = Integer.MIN_VALUE;
            int prefix[] = new int[numbers.length];
    
            prefix[0] = numbers[0];
            //calculate prefix array
            for(int i=1; i<prefix.length; i++){
                prefix[i] = prefix[i-1] + numbers[i];
            }
            for(int i=1; i<prefix.length; i++){
                prefix[i] = prefix[i-1] + numbers[i];
            }
    
            for(int i = 0 ;i<numbers.length; i++) {
                int start = i; 
                for(int j=i; j<numbers.length; j++){
                    int end = j;
                    currSum =  start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
    
                    if(maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
            }
            System.out.println("max sum = " + maxSum);

            public static void kadanes(int numbers[]){
                int ms = Interger.MIN_VALUE;
                int cs = 0;
                for(int i = 0; i<numbers.length; i++){
                    cs = cs+ numbers[i];
                    if(cs < 0 ) {
                        cs = 0;

                    }
                    ms = Math.max(cs , ms);

                }
                System.out.println("our max subarrays sum is : " +ms);
            

            

            public static void main (String args[]){
                int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
                kadanes(numbers);
            }



        }   
    
    }
