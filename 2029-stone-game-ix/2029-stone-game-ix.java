class Solution {
    public boolean stoneGameIX(int[] stones) {
        int zero=0;
        int one=0;
        int two=0;
        for(int x:stones){
            if(x%3==0) zero++;
            if(x%3==1) one++;
            if(x%3==2) two++;
        }
        if(one==0 && two==0) return false;
        if(zero%2==0){
            if(one>0 && two>0) return true;
            else return false;
        }else{
            if(Math.abs(one-two)>=3) return true;
            else return false;
        }
    }
}
        

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna