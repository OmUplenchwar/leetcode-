class Solution {
    public int minDays(int n) {
       int[] dp=new int[n+1];
       Arrays.fill(dp,-1);
       return helper(n,dp)-1;
    }
    public int helper(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1) return dp[n];
        int mindays=Integer.MAX_VALUE;
        for(int i=1; ;i++){
            int earned=(i*(i+1))/2;
            if(earned>n) break;
            int store=i+1+helper(n-earned,dp);
            mindays=Math.min(mindays,store);

        }
        dp[n]=mindays;
        return dp[n];

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna