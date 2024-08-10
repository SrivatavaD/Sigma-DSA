public class recursionSix {

    //Tiling Problem 
    //Given a "2 * n " floor and tiles of size "2*1", count the numbers of ways to tile the given board using the 2*1 tile.
    //(A tile can either be placed horizontaly or vertically.)
    public static int tilingproblem(int n ){
        //base case
        if(n==0 || n == 1){
            return 1;
        }
        //work
        //vertical choice
        int fnm1 = tilingproblem(n-1);

        //horizontal choice
        int fnm2 = tilingproblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(tilingproblem(n));
    }
    
}
