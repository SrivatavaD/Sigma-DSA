import java.util.*;
public class two {

    //Program to implement Linear Search
    // public static int LinearSearch(int numbers[] , int key){
    //     for(int i=0; i<numbers.length; i++){
    //         if(numbers[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String[] args) {
    //     int numbers[] = {2,4,6,7,8,10,12,14,16};
    //     int key = 20;

    //     int index = LinearSearch(numbers, key);
    //     if(index == -1){
    //         System.out.println("Not found");
    //     } else {
    //         System.out.println("Key is at index : " + index );
    //     }

    //Find the largest number in a given array

    // public static int getLargest(int numbers[]) {
    //     int largest = Integer.MIN_VALUE;  //-infinity
    //     int smallest = Integer.MAX_VALUE; //+infinity
    //     for(int i = 0; i<numbers.length; i++){
    //         if(largest < numbers[i]){
    //             largest = numbers[i];
    //         }

    //         if(smallest>numbers[i]){
    //             smallest = numbers[i];
    //         }
    //     }
    //     System.out.println("smallest value is: " + smallest);
    // }
    //     return largest;
    // }
    // public static void main(String[] args) {
    //     int numbers[] = {1,2,6,3,5};
    //     System.out.println("largest value is: " + getLargest(numbers));
       

    // Binary Search
public static int binarySearch(int numbers[] , int key){
    int start = 0, end = numbers.length-1;
    while(start <=end){
        int mid = (start+end)/2;

        //comparison

        if(numbers[mid] == key){   //found
            return mid;
        }
        if(numbers[mid] <key){  //right
            start = mid+1;
        } else {       //left
            end = mid-1;
        }

    }

    return -1;
}

public static void main(String[] args) {
    int numbers[] = {2,4,6,8,10,12,14};
    int key = 10;

    System.out.println("index for key is: " + binarySearch(numbers, key));
}

        
    }
    

