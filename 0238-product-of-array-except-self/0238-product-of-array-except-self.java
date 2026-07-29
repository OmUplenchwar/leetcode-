class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean flag=false;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                flag=true;
            }
            if(nums[i]==0) count++;
        }
        if(!flag) return nums;
        int store=1;
        int dummy=1;
        for(int i=0;i<nums.length;i++){
            dummy=dummy*nums[i];
            if(nums[i]==0) continue;
            store=store*nums[i];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(count>1){
                    ans[i]=0;
                    continue;
                }
                ans[i]=store;
                continue;
            }
            ans[i]=dummy/nums[i];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna