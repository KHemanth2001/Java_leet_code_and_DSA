public class lastIdxOfOccurance {
    public static void main(String[] args) {
        int[] ar={1,3,3,3,4,4,5,6,7,8};
        int n=occurance(ar,3,ar.length-1);
        System.out.println(n);
    }
    public static int occurance(int[] ar,int elm, int idx){
        if(idx<0)
            return -1;
        if(ar[idx]==elm)
            return idx;
        else
            return occurance(ar,elm,idx-1);
    }


}
