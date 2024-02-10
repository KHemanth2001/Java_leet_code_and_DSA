public class bubbleSortUsingRec {
    public static void main(String[] args) {
        int[] arr={11,5,3,4,10};
        bubbleSort(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void bubbleSort(int[] arr,int n){
        if(n==0 ||n==1){
            return;
        }
        loop(arr,arr.length-1,0);
        bubbleSort(arr,n-1);
    }

    public static void loop(int[] arr,int n,int i){
        if(i==n){
            return;
        }
        if(arr[i]>arr[i+1]){
            int t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
        }
        loop(arr,n,i+1);
    }
}
