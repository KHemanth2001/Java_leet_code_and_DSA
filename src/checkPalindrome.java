public class checkPalindrome {
    public static void main(String[] args) {
        String s="0P";
        isPalindrome(s);
    }
    public static void isPalindrome(String s) {
        String str=convertStr(s);
        System.out.println(str);
        String revS=revStr(str);
        System.out.println("Rev:"+revS);
        if(str.equals(revS)){
//            return true;
            System.out.println("true");
            return;
        }
        System.out.println(false);




    }
    public static String revStr(String s){
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str;
    }
    public static String convertStr(String s){
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                char c=(char)(s.charAt(i)+32);

                str+=c;
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                str+=s.charAt(i);
            }else{
                continue;
            }
        }
        return str;
    }
}
