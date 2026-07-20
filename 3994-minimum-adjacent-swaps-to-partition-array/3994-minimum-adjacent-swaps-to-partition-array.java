class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        int c1=0;
        int c2=0;
        int c3=0;
        long ans=0L;
        int mod=1000000007;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<a){
                ans=(ans+(c2+c3))%mod;
                c1++;
            }else if(nums[i]<=b){
                ans=(ans+c3)%mod;
                c2++;
            }else{
                c3++;
            }
        }
        return (int)ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna