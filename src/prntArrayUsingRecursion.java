public class prntArrayUsingRecursion {
    public static void arrayPrint(int[] ar,int idx){
        if(idx==ar.length){
            return;
        }
        System.out.println(ar[idx++]);
        arrayPrint(ar,idx);
    }

    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        arrayPrint(ar,3);
    }
}
