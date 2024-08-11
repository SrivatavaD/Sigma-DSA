public class recursionSeven {

    // Remove Duplicates in a string "appnnacollege"

    // public static void removeDuplicates(String str , int idx, StringBuilder newstr , boolean map[]){
    //     if(idx == str.length()){
    //         System.out.println(newstr);
    //         return;
    //     }
    //     //work
    //     char currchar = str.charAt(idx);
    //     if(map[currchar-'a'] == true){
    //         //duplicate
    //         removeDuplicates(str, idx+1, newstr, map);
    //     } else {
    //         map[currchar - 'a'] = true;
    //         removeDuplicates(str, idx+1, newstr.append(currchar),map);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "apnacollege";
    //     removeDuplicates(str, 0, new StringBuilder(" "),new boolean[26]);
    // }

    //Friends Pairing Problem
    //Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only 
    //once. Find out the total number of ways in which friends can remain single or can be paired up.

    // public static int friendsPairing(int n){
    //     if(n==1 || n==2){
    //         return n;
    //     }
    //     //choice
    //     //single
    //     int fnm1 = friendsPairing(n-1);
    //     //pair
    //     int fnm2 = friendsPairing(n-2);
    //     int pairWays = (n-1) * fnm2;

    //     //total ways
    //     int totWays = fnm1 + pairWays;
    //     return totWays;
    // }
    // public static void main(String[] args) {
    //     System.out.println(friendsPairing(30));
    // }

    //For a given integer array of size N. You have to find all the occurences(indices) of a given element(key)
    //and print them. use a recursive function to solve this problem.

    public static void allOccurences (int arr[], int key, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.println(i+" ");
        }
        allOccurences(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key =2;
        allOccurences(arr, key, 0);
        System.out.println();
    }

    
}
