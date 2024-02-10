public class StringReverseRec {
    public static void main(String[] args) {
        String s="Hello";
        stringReverse(s,s.length()-1);

    }
    public static void stringReverse(String s,int len){
        if(len<0){
            return;
        }
        System.out.print(s.charAt(len));
        stringReverse(s,len-1);
    }
}
