public class palindromeUsingRecursion {
    public static void main(String[] args) {
        String s="";
        boolean r=isPalindrome(s,0,s.length()-1);
        if(r){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
    public static boolean isPalindrome(String s,int i,int j){
//        if (s == null || s.length() <= 1) {
//            return true; // If string is null or has 0 or 1 character, it's a palindrome
//        }
        if(i>j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }else{
            return isPalindrome(s,i+1,j-1);
        }
    }
}
