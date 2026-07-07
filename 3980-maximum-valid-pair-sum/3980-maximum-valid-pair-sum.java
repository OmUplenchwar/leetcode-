class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max=0;
        int ans=0;
        int i=nums.length-1;
        int j=nums.length-1-k;
        while(j>=0){
            max=Math.max(max,nums[i]);
            ans=Math.max(ans,max+nums[j]);
            i--;
            j--;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna