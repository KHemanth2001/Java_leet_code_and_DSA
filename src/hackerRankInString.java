public class hackerRankInString {
    public static void main(String[] args) {
        String s="hereiamstackerrank";
        hackerrankInString(s);
    }
    public static void hackerrankInString(String s) {
        // Write your code here
        int indx=0,i=0;
        String wrd="hackerrank";
        while(i<s.length()){
            if(s.charAt(i)==wrd.charAt(indx)){
//                System.out.println(s.charAt(i)+ "-"+ wrd.charAt(indx));
                indx++;
                i++;
            }else {
                System.out.println(s.charAt(i) + "-" + wrd.charAt(indx));
                i++;
            }
        }
        System.out.println(indx);
//        if(indx==wrd.length())
//            return "YES";
//        return "NO";

    }
}
