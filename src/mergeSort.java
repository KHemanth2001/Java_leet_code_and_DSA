public class mergeSort {
    public static void main(String[] args) {
        int[] arr={11,5,3,4,10};
//        selectionSort(arr,arr.length,0);
        MergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void MergeSort(int[] arr,int s, int e){
        if(s>=e){
            return;
        }
//        System.out.println("start:"+s);
        int mid=(s+e)/2;
//        System.out.println("mid:"+mid);
//        System.out.println("end:"+e);
        MergeSort(arr,s,mid);
        MergeSort(arr,mid+1,e);
        merge(arr,s,e);
    }
    public static void merge(int[] arr, int s, int e){
        int mid=(s+e)/2;
        int[] merged=new int[e-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=e){
            if(arr[idx1]<arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=e){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=s;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(" "+arr[i]);
//        }
//        System.out.println();
    }
}
