public class linearsearchrec {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,10};
        int n=linearSearch(arr,1,arr.length-1);
        System.out.println(n);

    }
    public static int linearSearch(int[] arr,int key,int idx){
        if(arr[idx]==key){
            return idx;
        }
        if(idx==0){
            return -1;
        }
        return linearSearch(arr,key,idx-1);
    }
}
