class Solution {
    public String stoneGameIII(int[] arr) {
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        int ans=helper(0,arr,dp);
        if(ans>0) return "Alice";
        if(ans==0) return "Tie";
        if(ans<0) return "Bob";
        return " ";
    }
    public int helper(int i,int[] arr,int[] dp){
        if(i==arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int one=Integer.MIN_VALUE;
        int two=Integer.MIN_VALUE;
        int three=Integer.MIN_VALUE;
        one=arr[i]-helper(i+1,arr,dp);
        if((i+2)<=arr.length){
            two=arr[i]+arr[i+1]-helper(i+2,arr,dp);
        }
        if((i+3)<=arr.length){
            three=arr[i]+arr[i+1]+arr[i+2]-helper(i+3,arr,dp);
        }
        dp[i]=Math.max(one,Math.max(two,three));
        return dp[i];
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna