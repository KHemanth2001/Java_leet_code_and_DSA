import java.util.*;
public class printLength {
    public static void main(String[] args) {
        String s="zabc";
        int[] h= {1,3,1,3,1,4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
//        System.out.println((int)s - 97);
//        System.out.println(largechar("zabc"));
        designerPdfViewer(h,s);
//        System.out.println(a);
    }
    public static char largechar(String word){
        char c=word.charAt(0);
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)>c){
                c=word.charAt(i);
            }
        }
        return c;
    }
    public static void designerPdfViewer(int[] h, String word) {
        // Write your code here
        char large=largechar(word);
        int height= (int)large - 97;
        System.out.println("height: "+height);
        int hei=h[height];
        System.out.println(hei);
        int area=hei*word.length();
        System.out.println(area);

    }
}
