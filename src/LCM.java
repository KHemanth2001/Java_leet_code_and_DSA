public class LCM {
    public static int Lcm(int[] a) {
        int lc = a[0];
        int lcm = 0;
        while (lcm == 0) {
            for (int i = 0; i < a.length; i++) {
                if (lc % a[i] == 0) {
                    if (i == a.length - 1) {
                        lcm = lc;
                        break;
                    }
                } else {
                    break;
                }
            }
            ++lc;
        }
        return lcm;
    }


    public static void main(String[] args) {
        int[] arr={3,4,5};
        int lcm=Lcm(arr);
        System.out.println(lcm);
    }
}
