import java.util.Scanner;
import java.util.Arrays;
public class four {



    //GIven an array arr[] and an integer k, where k is smaller than size of array
    //the  task is to find the kth smallest element in the given array. it is given 
    //the all array elements are distinct.

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }

    
}
