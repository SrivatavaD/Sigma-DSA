public class recursionFour {
    //Check if a given array is sorted or not
    // public static boolean isSorted (int arr[], int i){
    //     if(i == arr.length-1){
    //         return true;
    //     }
    //     if(arr[i] > arr[i+1]){
    //         return false;
    //     }
    //     return isSorted(arr,i+1);
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,6,5};
    //     System.out.println(isSorted(arr,0));
    // }

    // WAF to find the first occurence of an element in array.

//     public static int firstOccurence(int arr[], int key , int i){
//     if(arr[i] == key) {
//         return -1;
//     }
//     if (arr[i] == key){
//         return i;
//     }
//     return firstOccurence(arr, key, i+1);
// }
// public static void main(String[] args) {
//     int arr[] = {8,3,6,9,5,10,2,5,3};
//     System.out.println(firstOccurence(arr, 5, 0));
// }

//WAF to find the last occurenece of an element in an array

public static int lastOccurence(int arr[], int key , int i ){
    if(i==arr.length){
        return -1;
    }
    int isFound = lastOccurence(arr, key, i+1);
    if(isFound = -1 && arr[i] == key){
        return i;
    }
    return isFound;
}
public static void main(String[] args) {
    int arr[] = {8,3,6,9,5,10,2,5,3};
    System.out.println(lastOccurence(arr, 5, 0));
}
    
}
