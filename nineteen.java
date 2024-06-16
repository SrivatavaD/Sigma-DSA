import java.util.*;
public class nineteen {

    //Bit Manipulation 
    // public static void oddOrEven(int n){
    //     int bitMask=1;
    //     if((n & bitMask) == 0){
    //         //even number 
    //         System.out.println("even number");
            
    //     } else {
    //         System.out.println("odd number");
    //     }
    // }
    // public static void main(String[] args) {
    //     oddOrEven(3);
    //     oddOrEven(11);
    //     oddOrEven(14);
    // }

    // public static int getIthBit(int n , int i){
    //     int bitMask = 1<<i;
    //     if((n & bitMask) == 0){
    //         return 0;
    //     } else {
    //         return 1;
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(getIthBit(10,2 ));
    // }

    // public static int setIthBit(int n, int i){
    //     int bitMask = 1<<i;
    //     return n | bitMask;
    // }
    // public static void main(String[] args) {
    //     System.out.println(setIthBit(10, 2));
    // }

    // public static int updateIthBit(int n , int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n,i);
        // } else {
        //     return setIthBit(n,i);
        // }

    //     n = clearIthBit(n, i);
    //     int BitMask  = newBit<<i;
    //     return n | BitMask;
    // }

    // public static void main(String[] args) {
             
        
    // }
    public static int clearBits(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearIBites(int n , int i , int j){
        int a = ((~0) << (j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIBites(15, 2, ));
    }
    
}
