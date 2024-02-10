public class funnyString {
    public static String funnystring(String s) {
        // Write your code here
        String s1="";
        // reverse of string
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }

        int [] ar1=new int[s.length()-1];
        int [] ar2=new int[s.length()-1];
        for(int i=0;i<s.length()-1;i++){
            ar1[i]=Math.abs(s.charAt(i+1)-s.charAt(i));
            ar2[i]=Math.abs(s1.charAt(i)-s1.charAt(i+1));
        }
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]!=ar2[i]){
                return "Not Funny";
            }
        }
        return "Funny";

    }

    public static void main(String[] args) {
        String s="bcxz";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        System.out.println(s1);
        System.out.println(funnystring(s));
    }
}
