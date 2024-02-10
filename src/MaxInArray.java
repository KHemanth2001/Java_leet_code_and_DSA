import java.util.*;
public class MaxInArray {
    public static int maxElm(int[] ar,int idx){
        if(idx==ar.length-1)
            return ar[idx];
        int misa=maxElm(ar,++idx);
        if(misa>ar[idx]){
            return misa;
        }else{
            return ar[idx];
        }
    }

    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int n=maxElm(ar,0);
        System.out.println(n);
    }
}
