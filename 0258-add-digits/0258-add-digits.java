class Solution {
    public int addDigits(int num) {
        

        //  int temp=0;
        while(true){
            int temp=0;
            while(num>0){
                temp=temp+(num%10);
                num=num/10;
            }
            if(temp==10) return 1;
            if(temp<10) return temp;
            num=temp;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna