class Solution {
    public int stoneGameVII(int[] stones) {
        int[][] dp=new int[stones.length][stones.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int[] prefix=new int[stones.length+1];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+stones[i-1];
        }
        return helper(stones,0,stones.length-1,dp,prefix);
    }
    public int helper(int[] stones,int s,int e,int[][] dp,int[] prefix){
        if(s==e) return 0;
        if(dp[s][e]!=-1) return dp[s][e];
        int one=prefix[e]-prefix[s]-helper(stones,s,e-1,dp,prefix);
        int two=prefix[e+1]-prefix[s+1]-helper(stones,s+1,e,dp,prefix);
        dp[s][e]=Math.max(one,two);
        return Math.max(one,two);
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna