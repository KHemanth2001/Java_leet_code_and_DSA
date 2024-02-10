public class sos {
    public static int marsExploration(String s) {
        // Write your code here
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(i%3==0 && s.charAt(i)!='S')
                cnt++;
            else if(i%3==1 && s.charAt(i)!='O')
                cnt++;
            else if(i%3==2 && s.charAt(i)!='S')
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s="SOSSPSSQSSOR";
//        marsExploration(s);

        System.out.println(marsExploration(s));
    }
}
