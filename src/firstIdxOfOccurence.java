public class firstIdxOfOccurence {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int n=occurance(ar,3,0);
        System.out.println(n);
    }
    public static int occurance(int[] ar,int elm,int idx){
//        if(idx==ar.length)
//            return -1;
//        int occ=occurance(ar,elm,idx+1);
//        if(ar[idx]==elm)
//            return idx;
//        else
//            return occ;
    if(idx==ar.length)
        return -1;
    if(ar[idx]==elm)
        return idx;
    else
        return occurance(ar,elm,idx+1);




    }
}
