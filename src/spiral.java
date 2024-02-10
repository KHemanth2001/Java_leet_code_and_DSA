public class spiral {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int minrow=0;
        int mincol=0;
        int maxrow=2;
        int maxcol=2;
        int count=0;
        while(count<(9)){
            //left wall
            for(int i=minrow,j=mincol;i<=maxrow;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            mincol++;
            //bottom wall
            for(int i=maxrow,j=mincol;j<=maxcol;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxrow--;
            //right wall
            for(int i=maxrow,j=maxcol;i>=minrow;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxcol--;
            //top wall
            for(int i=minrow,j=maxcol;j>=mincol;j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minrow++;
        }
    }
}
