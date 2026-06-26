class Solution {
    public boolean isTrionic(int[] nums) {
        int i=1;
        while(i<nums.length && nums[i-1]<nums[i]) i++;
        if(i==1 || i==nums.length) return false;
        
        int temp1=i;
        while(i<nums.length && nums[i-1]>nums[i]) i++;
        if(i==temp1 || i==nums.length) return false;
        int temp2=i;
        while(i<nums.length && nums[i-1]<nums[i]) i++;
        return i==nums.length;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna