class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }else{
                if(a[2]!=b[2]){
                    return b[2]-a[2];
                }else{
                    return a[1]-b[1];
                }
            }
        });
        long[] dp=new long[rides.length+1];
        Arrays.fill(dp,-1L);
        return helper(rides,0,dp);

    }
    public long helper(int[][] rides,int idx,long[] dp){
        if(idx>=rides.length) return 0L;
        if(dp[idx]!=-1) return dp[idx];
        long pick=rides[idx][1]-rides[idx][0]+rides[idx][2];
        long dpick=helper(rides,idx+1,dp);
        for(int i=idx+1;i<rides.length;i++){
            if(rides[i][0]>=rides[idx][1]){
                pick=rides[idx][1]-rides[idx][0]+rides[idx][2]+helper(rides,i,dp);
                break;
            }
            // dpick=Math.max(dpick,helper(rides,i,dp));
        }
        dp[idx]=Math.max(pick,dpick);
        return dp[idx];

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna