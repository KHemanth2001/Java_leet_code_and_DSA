public class zigzag {
    public static void zigzg(int n){
        if(n==1){
            System.out.print("111");
            return;
        }
        System.out.print(n);
        zigzg(n-1);
        System.out.print(n);
        zigzg(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        zigzg(3);
    }
}
