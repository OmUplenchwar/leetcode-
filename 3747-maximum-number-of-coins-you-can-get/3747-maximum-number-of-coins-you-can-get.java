class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans=0;
        int s=0;
        int e=piles.length-1;
        while(s<e){
            ans+=piles[e-1];
            s++;
            e-=2;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna