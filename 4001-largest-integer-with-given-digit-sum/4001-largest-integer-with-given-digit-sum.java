class Solution {
    public int largestInteger(int n, int s) {
        if(9*n<s) return -1;
        int ans=0;
        while(s>0){
            if(s<9){
                ans=ans*10+s;
                s=0;
                continue;
            }
            ans=ans*10+9;
            s-=9;
        }
        int store=1;
        if(ans>0){
            store=(int)Math.floor(Math.log10(ans))+1; 
        }
        
        while(store<n){
            ans=ans*10;
            store++;
        }
            
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna