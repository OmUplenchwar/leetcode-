class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max((nums[0]-1)*(nums[1]-1),(nums[nums.length-1]-1)*(nums[nums.length-2]-1));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna