class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int odd=0;
            int even=0;
            if(nums[i]%2==0){
                even++;
            }else{
                odd++;
            }
            if(nums[i+1]%2==1){
                odd++;
            }else{
                even++;
            }
            if(odd!=even) return false; 
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna