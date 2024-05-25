
import java.util.*;



import java.io.*;
public class five {

    // Find the total number of pairs in the array whose sum is equal to the given
    // value x.
    // public static int pairSum(int a[], int x){
    //     int count = 0;
    //     int n = a.length;
    //     for(int i = 0; i<n; i++)
    //     for(int j=i+1; j<n; j++)
    //     if(a[i] + a[j] ==x)
    //     count++;
    //     return count;
    // }
    // public static void main(String [] args){
    //     int a[] = {4,7,3,21,6,5,5};
    //     System.out.println(pairSum(a,10));
    // }

    // 

    //Find the unique number in a given array where all the elements are repeated
    //twice with one value being unique

    public static int findUnique(int[] a){
        int n = a.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n ; j++){
                if(a[i] == a[j]){
                    a[i] = a[j] = -1;
                }
            }
        }
        for(int i = 0; i<n; i++){
            if(a[i]>0)
            return 1 ;
        }
    public static void main(String[] args){
        int a[] = {21,7,8,21,5,7,5};
        System.out.println(findUnique(a));
    }

    //Find the second-largest value in the given array.

    }
    

