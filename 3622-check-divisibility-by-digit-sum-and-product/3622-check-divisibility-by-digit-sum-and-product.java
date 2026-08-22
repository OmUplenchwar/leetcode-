class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int store=n;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            product*=temp;
            n=n/10;
        }
        return store%(sum+product)==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna