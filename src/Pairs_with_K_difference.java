public class Pairs_with_K_difference {
    public static void main(String[] args) {
        int[] nums={1,2,2,1};
        int k=1;
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            System.out.println(Math.abs(nums[i+1]-nums[i]));
            if(Math.abs(nums[i+1]-nums[i])==k){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
