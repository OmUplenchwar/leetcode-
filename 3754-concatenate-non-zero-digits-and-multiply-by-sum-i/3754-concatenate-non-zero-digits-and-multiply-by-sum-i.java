class Solution {
    public long sumAndMultiply(int n) {
        long sum=0L;
        long digit=0L;
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        // System.out.println(sb);
        for(int i=0;i<sb.length();i++){
            sum+=(sb.charAt(i)-'0');
            if(sb.charAt(i)!='0'){
                digit=(digit*10)+(sb.charAt(i)-'0');
            }
        }
        // System.out.println(sum+" "+digit);
        return digit*sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna