class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4) return 0;
        Arrays.sort(nums);
        int one=Math.min(nums[nums.length-1]-nums[3],nums[nums.length-2]-nums[2]);
        int two=Math.min(nums[nums.length-3]-nums[1],nums[nums.length-4]-nums[0]);
        return Math.min(one,two);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna