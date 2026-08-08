class Solution {
    public int[] validSequence(String s, String t) {
        int[] pre=new int[s.length()+1];
        int j=t.length()-1;
        for(int i=s.length()-1;i>=0;i--){
            if(j>=0 && s.charAt(i)==t.charAt(j)){
                pre[i]=pre[i+1]+1;
                j--;
            }else{
                pre[i]=pre[i+1];
            }
        }
        boolean flag=true;
        int[] ans=new int[t.length()];
        int idx=0;
        j=0;
        for(int i=0;i<s.length()&&j<t.length();i++){
            int rem=t.length()-j-1;
            if(s.charAt(i)==t.charAt(j)){
                ans[idx]=i;
                idx++;
                j++;
            }else{
                if(flag && pre[i+1]>=rem){
                    ans[idx]=i;
                    idx++;
                    j++;
                    flag=false;
                }
                
            }
        }
        if(j==t.length()) return ans;
        return new int[0];

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna