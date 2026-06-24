class Solution {
    public int maxRotateFunction(int[] nums) {
        int ans=0;
        int instance=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            instance+=i*nums[i];
            sum+=nums[i];
        }
        ans=instance;
        int temp=nums.length-1;
        int zero=nums.length-1;
        // int three=zero-1;
        while(temp>0){
            instance=(instance+sum)-(nums[zero]*nums.length);
           ans=Math.max(ans,instance);
           temp--;
           zero--;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna