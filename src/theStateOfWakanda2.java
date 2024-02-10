public class theStateOfWakanda2 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int j=0,mincol=0;
        while(mincol<4){
            int i=0;
            j=mincol;
            while(i<4 && j<4){
                System.out.println(arr[i++][j++]);
            }
            mincol++;
        }
    }
}
