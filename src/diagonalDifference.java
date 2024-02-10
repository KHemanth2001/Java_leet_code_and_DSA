import java.util.*;
import java.lang.*;
public class diagonalDifference {
    public static int diagonalDifference(int[][] arr) {
        // Write your code here
        int d1s = 0, d2s = 0;
        int i = 0, j = arr.length - 1;
        while (i != arr.length) {
            d1s += arr[i][i];
            d2s += arr[i][j];
            i++;
            j--;
        }
        return Math.abs(d2s - d1s);
    }

    public static void main(String[] args) {
//        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
//        Scanner sc=new Scanner(System.in);
//        int n=3;
//        int dif=diagonalDifference(arr);
//        System.out.println(dif);
        String s="12:05:45AM";
        if(s.contains("12")){
            if(s.contains("PM")){
                System.out.println(s.substring(0,s.length()-2));
            }else{
                System.out.println("00"+s.substring(2,s.length()-2));
            }
        }
//        String med=s.substring(s.length()-2,s.length());
//        System.out.println(med);
//        String time=s.substring(0,2);
//        System.out.println(time);
//        int tim=Integer.parseInt(time);
//        int t=tim+12;
//        String acttime=Integer.valueOf(t)+s.substring(2,s.length()-2);
//        System.out.println(acttime);
    }
}
