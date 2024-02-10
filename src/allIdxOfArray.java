public class allIdxOfArray {
    public static int[] indices(int[] ar,int elm, int idx, int fsf){
//        int[] arr=new int[ar.length];
        if(idx==ar.length)
            return new int[fsf];
        int[] arr1;
        if(ar[idx]==elm){
           arr1=indices(ar,elm,idx+1,fsf+1);
           arr1[fsf]=idx;
        }else{
            arr1=indices(ar,elm,idx+1,fsf);
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] ar={1,3,3,3,4,4,5,6,7,8};
        int[] arr=new int[ar.length-1];
        int[] arr1=indices(ar,3,0,0);
        for(int i=0;i<arr1.length;i++){
            System.out.println("Index: "+arr1[i]);
        }
    }
}
