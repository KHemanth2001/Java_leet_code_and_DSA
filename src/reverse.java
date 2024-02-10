public class reverse {
    public static void isPalindrome(int x) {
        if(x<0){
//            return false;
        }
        int r=0,tem=x;
        while(x>0){
            int t=x%10;
            r=r*10+t;
            x=x/10;
        }
//        return (r==x);
        System.out.println(r);

    }
    public static void main(String[] args) {
        int n=121,r=0;
//        boolean b=isPalindrome(n);
        isPalindrome(n);
    }
}
