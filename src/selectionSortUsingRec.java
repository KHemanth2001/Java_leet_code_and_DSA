public class selectionSortUsingRec {
    public static void main(String[] args) {
        int[] arr={11,5,3,4,10};
        selectionSort(arr,arr.length,0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void selectionSort(int[] arr, int n, int i){
        if(i==n){
            return;
        }
        int small=i;
        for(int j=i+1;j<n;j++){
            if(arr[small]>arr[j]){
                small=j;
            }
        }
        int t=arr[i];
        arr[i]=arr[small];
        arr[small]=t;
        selectionSort(arr,n,i+1);
    }
}
