class Solution {
    public int numberOfSets(int n, int k) {
        long[][][] dp=new long[n+1][k+1][2];
        for(int i=0;i<dp.length;i++){
           for(int j=0;j<dp[i].length;j++){
            Arrays.fill(dp[i][j],-1);
           }
        }
        return (int)helper(dp,0,n,k,0,0);

    }
    public long helper(long[][][] dp,int idx,int n,int k,int sam,int count){
        if(count==k && sam==0){
            return 1;
        }
        if(count==k && sam==1) return 0;
        if(idx>=n){
            return 0;
        }
        if(dp[idx][count][sam]!=-1){
            return dp[idx][count][sam];
        }
        long ans=0L;
        if(sam==0){
            
                long store1=helper(dp,idx+1,n,k,0,count);
                long store2=helper(dp,idx+1,n,k,1,count);
                ans+=store1;
                ans=ans%1000000007;
                ans+=store2;
                ans=ans%1000000007;
            
        }else{
                long store1=helper(dp,idx+1,n,k,1,count);
                long store2=helper(dp,idx+1,n,k,0,count+1);
                long store3=helper(dp,idx+1,n,k,1,count+1);
                ans+=store1;
                ans=ans%1000000007;
                ans+=store2;
                ans=ans%1000000007;
                ans+=store3;
                ans=ans%1000000007;
        }
        dp[idx][count][sam]=ans;
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna