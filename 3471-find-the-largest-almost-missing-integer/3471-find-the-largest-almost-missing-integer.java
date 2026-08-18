class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k==1){
           HashMap<Integer,Integer> map=new HashMap<>();
           for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
           }
           int ans=-1;
           for(int x:map.keySet()){
             if(map.get(x)==1) ans=Math.max(ans,x);
           }
           return ans;
        }
        if(k==nums.length){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
         int right=nums[nums.length-1];
         int left=nums[0];
         if(right==left) return -1;
         boolean flag1=false;
         boolean flag2=false;
         for(int i=1;i<nums.length-1;i++){
            if(nums[i]==left) flag1=true;
            if(nums[i]==right) flag2=true;
         }
        //  for(int i=nums.length-2;i>=nums.length-1-k;i--){
        //     if(nums[i]==right) flag2=true;
        //  }
         if(flag1 && flag2) return -1;
         if(flag1) return right;
         if(flag2) return left;
         return Math.max(right,left);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna