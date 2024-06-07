import java.util.*;
public class thirteen {
    //Use the followoing sorting algorithm to sort an array on descending order
    //[3,6,2,1,8,7,4,5,3,1]

    //Insertion Sort
//     public static void insertionSort(int arr[]){
//         for(int i = 0; i<arr.length; i++) {
//             int curr = arr[i];
//             int prev = i-1;
//             while(prev >=0 && arr[prev] > arr[curr]){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }

//             //insertion
//             arr[prev+1] = arr[curr];
//         }


//     }
//     public static void printArr(int arr[]){
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

  
//   public static void main(String[] args) {
//     int arr[] = {3,6,2,1,8,7,4,5,3,1};
//     insertionSort(arr);
//     printArr(arr);
//   }
    
//Counting Sort

public static void countingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0 ; i<arr.length; i++){
        largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest+1];
    for(int i = 0; i<arr.length; i++) {
        count[arr[i]]++;
    }

    //sorting
    int j = 0; 
    for(int i = 0; i<count.length; i++){
        while(count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
}
public static void printArr(int arr[]){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


public static void main(String[] args) {
int arr[] = {3,6,2,1,8,7,4,5,3,1};
countingSort(arr);
printArr(arr);
}

}
