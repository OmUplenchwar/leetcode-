class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        // int max=0;
        int ans=0;
        while(j<nums.length){
            if(map.getOrDefault(nums[j],0)<k){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                ans=Math.max(ans,j-i+1);
                j++;
            }else{
                int temp=nums[j];
                while(i<j){
                    if(nums[i]==temp){
                        map.put(nums[i],map.get(nums[i])-1);
                        i++;
                        break;
                    }else{
                        map.put(nums[i],map.get(nums[i])-1);
                        i++;
                    }
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna