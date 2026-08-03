class Solution {
    public boolean stoneGame(int[] nums) {
       int[][] dp=new int[nums.length][nums.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,nums.length-1,nums,dp)>=0;

    }
    public int helper(int i,int j,int[] nums,int[][] dp){
        if(i==j){
            return nums[j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int left=nums[i]-helper(i+1,j,nums,dp);
        int right=nums[j]-helper(i,j-1,nums,dp);
        dp[i][j]=Math.max(left,right);
        return dp[i][j];
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna