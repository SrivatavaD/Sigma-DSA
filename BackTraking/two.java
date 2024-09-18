public class two {
    public static void findPermutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            //abcde => "ab"+"de"="abde"
            str = str.substring(0,1)+str.substring(i+1);
            findPermutation(str, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str,"");
    }
    
}