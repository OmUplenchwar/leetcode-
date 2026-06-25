class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<nums.length;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(map.getOrDefault(target,0)>(j-i+1)/2) ans++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna