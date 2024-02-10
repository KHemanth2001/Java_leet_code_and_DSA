public class binarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,10};
        int n=bS(arr,0,arr.length-1,10);
        System.out.println(n);
    }
    public static int bS(int[] arr,int st,int ed,int key){
        if(ed<st){
            return -1;
        }
        int mid=(st+ed)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]<key){
            st=mid+1;
            return bS(arr,st,ed,key);
        }else{
            ed=mid-1;
            return bS(arr,st,ed,key);
        }
    }
}
