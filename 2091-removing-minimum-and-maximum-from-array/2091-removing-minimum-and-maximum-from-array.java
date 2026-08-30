class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        int small=Math.min(min,max);
        int big=Math.max(min,max);
        int one=big+1;
        int two=nums.length-small;
        int three=small+1+(nums.length-big);
        return Math.min(one,Math.min(two,three));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna