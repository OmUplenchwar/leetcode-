class Solution {
    public int concatenatedBinary(int n) {
        long ans=0L;
        int count=1;
        for(int i=n;i>0;i--){
            int t=i;
           while(t>0){
            int temp=t & 1;
            t=t>>1;
            ans=(ans+(long)count*temp)%1000000007L;
            count=count*2;
            count=count%1000000007;
           }
        }
        return (int)ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna