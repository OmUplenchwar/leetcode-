class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        int[] small=new int[26];
        int[] big=new int[26];
        Arrays.fill(small,-1);
        Arrays.fill(big,1000000);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)<='z' && word.charAt(i)>='a'){
                
                    small[word.charAt(i)-'a']=Math.max(small[word.charAt(i)-'a'],i);
                
            }else{
               
                    big[word.charAt(i)-'A']=Math.min(big[word.charAt(i)-'A'],i);
                
            }
        }
        for(int i=0;i<26;i++){
            if(big[i]==1000000 || small[i]==-1) continue;
            if(big[i]>small[i]) ans++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna