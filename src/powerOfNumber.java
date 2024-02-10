public class powerOfNumber {
    public static void main(String[] args) {
        int n=2,ex=3;
        int val=powerOfnumber(n,ex);
        System.out.println(val);
    }
    public static int powerOfnumber(int n,int ex){
        if(ex==0){
            return 1;
        }
        if(ex%2!=0){
            return n*powerOfnumber(n,ex/2)*powerOfnumber(n,ex/2);
        }else{
            return powerOfnumber(n,ex/2)*powerOfnumber(n,ex/2);
        }
    }
}
