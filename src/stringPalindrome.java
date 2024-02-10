import java.util.*;
public class stringPalindrome {
    public static void main(String[] args) {
        char a='a';
        System.out.println((int)a);
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String str = s.substring(i, j);
                if (isPalindrome(str)) {
                    System.out.println("palindrome: " + str);
                }
            }
        }

    }
    public static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }

        }
        return true;
    }
}
