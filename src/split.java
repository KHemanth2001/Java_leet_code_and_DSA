public class split {
    public static void main(String[] args) {
        String s="a good   example";
        String[] arr=s.split(" ");
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(" ")){
                arr[i]="1";
            }
//            arr[i]=arr[i].split(" ")[0];
            System.out.println(i+arr[i]);
        }
        System.out.print("]");
    }
}
