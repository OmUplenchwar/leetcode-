class Solution {
    public int numOfWays(int n) {
        long two=6;
        long three=6;
        int mod=1000000007;
        for(int i=2;i<=n;i++){
            long nexttwo=(two*3 + three*2)%mod;
            long nextthree=(two*2 + three*2)%mod;
            two=nexttwo;
            three=nextthree;
        }
        return (int)(two+three)%mod;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna