public class palindrome {
    public static void isPalindrome(int x) {
        if(x<0){
            return;
        }
        int r=0,tem=x;
        while(x>0){
            int t=x%10;
            r=r*10+t;
            x=x/10;
        }
        if (r==tem)
        System.out.println(r);

    }

    public static void main(String[] args) {
        int n=121;
//        boolean r=isPalindrome(n);
        System.out.println();
        isPalindrome(n);
    }
}
