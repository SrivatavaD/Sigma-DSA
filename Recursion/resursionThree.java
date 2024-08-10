public class resursionThree {
    //Print the sum of first n natural numbers.

    // public static int calsSum(int n){
    //     if (n==1) {
    //         return 1;
    //     }
    //     int Snm = calsSum(n-1);
    //     int Sn = n+ Snm+1;
    //     return Sn;
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     System.out.println(calsSum(n));
    // }

    // Print nth fibonacci numbers
    public static int fib(int n){
        if(n==0 || n==1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 36;
        System.out.println(fib(n));
    }
    
}
