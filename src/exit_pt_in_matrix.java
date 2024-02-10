public class exit_pt_in_matrix {
    public static void main(String[] args) {
        int arr[][]={{0,0,1,0},
                {1,0,0,0},
                {0,0,0,0},
                {1,0,1,0}};
        int count=0,dir=0,i=0,j=0;
        while(true){
            dir=(dir+arr[i][j])%4;
            if(dir==0) j++;
            else if(dir==1) i++;
            else if(dir==2) j--;
            else if(dir==3) i--;

            if(i<0){
                i++;
                break;
            }
            if(j<0){
                j++;
                break;
            }
            if(i==4){
                i--;
                break;
            }if(j==4){
                j--;
                break;
            }
        }
        System.out.println(i+" "+j);
    }
}
