import java.util.*;
public class seventeen {
    //check for a number is palindrome or not
    //get the sortest path in the string
    public static boolean isPalindrome(String str){
        for(int  i = 0 ; i< str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;

            }
        }
        return true;
    }

    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int  i = 0; i<path.length(); i++) {
            char dir = path.charAt(i);
            //south
            if(dir == 's'){
                y--;
            }

            //North
            else if(dir == 'N'){
                y++;
            }

            //West
            else if(dir == 'W'){
                x--;
            }

            //East
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
        
    }
    public static void main(String[] args) {
        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        String path = "WNEENSENNN";
        System.out.println(getShortestPath(path));
    }
    
}
