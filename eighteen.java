import java.util.*;
public class eighteen {

    //for a given set of strings , print the largest string
    // public static void main(String[] args) {
    //     String fruits[] = {"apple", "mango" , "banana"};
    //     String largest = fruits[0];
    //     for(int i=1; i<fruits.length; i++){
    //         if(largest.compareTo(fruits[i]) < 0){
    //             largest = fruits[i];
    //         }
    //     }
    // }

    //for a given string convert each of the first letter of each word to uppercase.

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am devansh";
        System.out.println(toUpperCase(str));

    }
    
}
