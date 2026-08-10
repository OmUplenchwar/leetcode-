class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int ans=helper(n);
            if(ans%t==0) return n;
            else{
                n++;
            }
        }
        // return 0;
    }
    public int helper(int n){
        int store=1;
        while(n>0){
            store=store*(n%10);
            n=n/10;
        }
        return store;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna