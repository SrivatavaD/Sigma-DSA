public class recursionOne {

    // print the numbers from 10 to 1 
    // public static void printDec(int n) {
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printDec(n-1);
    // }

    // public static void main(String[] args) {
    //     int n = 10;
    //     printDec(n);
    // }

    // print the numbers from 1 to n in increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        int n = 5;
        printInc(n);
    }
    
}
