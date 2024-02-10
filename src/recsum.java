public class recsum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,10};
        int n=recursum(arr,arr.length-1);
        System.out.println(n);
    }
    public static int recursum(int[] arr,int n){
        if(n==0){
            return arr[0];
        }
        return arr[n]+recursum(arr,n-1);
    }
}
