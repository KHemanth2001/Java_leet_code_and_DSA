public class substringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest =s.substring(0,k);
        String largest = s.substring(0,k);
        for(int i=0;i<=s.length()-k;i++){
            if(s.substring(i,i+k).compareTo(largest)>0){
                largest=s.substring(i,i+k);
            }
            else if(s.substring(i,i+k).compareTo(smallest)<0){
                smallest=s.substring(i,i+k);
            }
        }



        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String s="welcometojava";
        System.out.println(getSmallestAndLargest(s,3));
    }
}
