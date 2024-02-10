public class QuickSort {
    public static void main(String[] args) {
        int[] arr={12,11,5,3,4,10};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void quickSort(int[] arr,int st, int end){
        if(st<end){
            int pivot=partition(arr,st,end);

            quickSort(arr,st,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }
    public static int partition(int[] arr, int st,int end){
        int pivot=arr[end];
        // indx that sorts the elements based on value
        int i=st-1;
        for(int j=st;j<end;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        i++;
        int t=arr[i];
        arr[i]=pivot;
        arr[end]=t;
        return i;
    }
}
