class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        if(nums[0]<0 && nums[1]<0){
           return  Math.max(nums[0]*nums[1]*nums[n],nums[n-1]*nums[n-2]*nums[n]);
        }else{
            return nums[n]*nums[n-1]*nums[n-2];
        }
        // return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna