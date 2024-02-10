public class TOI {
    public static void towerOfHanoi(int n,String src, String hlp, String des){
        if(n==1){
            System.out.println("placing disk "+n+"from "+src+"->"+des);
            return;
        }
        towerOfHanoi(n-1,src,des,hlp);
        System.out.println("placing disk "+n+"from "+src+"->"+des);
        towerOfHanoi(n-1,hlp,src,des);
    }

    public static void main(String[] args) {
        towerOfHanoi(3,"s","H","D");
    }
}
