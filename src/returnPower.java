import java.util.Scanner;
public class returnPower {
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        int pnb2=pow(x,n/2);
        int xn=pnb2*pnb2;
        if(n%2==1){
            xn=x*xn;
        }
        return xn;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(pow(x,n));
    }
}
