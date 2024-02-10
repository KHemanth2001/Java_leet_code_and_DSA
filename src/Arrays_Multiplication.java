import java.util.Scanner;

public class Arrays_Multiplication {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int arr1[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix details:");
        int p=sc.nextInt();
        int q= sc.nextInt();
        int arr2[][]=new int[p][q];
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        // Arrays product
        int prd[][]=new int[n][q];
        if(m!=p){
            System.out.print("invalid Input");
        }else{
            for(int i=0;i<n;i++){
                for(int j=0;j<q;j++){
                    for(int k=0;k<m;k++){
                        prd[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<q;j++){
                    System.out.print(prd[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
