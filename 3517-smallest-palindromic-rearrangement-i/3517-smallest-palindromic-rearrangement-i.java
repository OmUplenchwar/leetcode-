class Solution {
    public String smallestPalindrome(String s) {
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        char[] arr=new char[s.length()];
        int i=0;
        int j=s.length()-1;
        for(int k=0;k<26;k++){
            while(count[k]>1){
                arr[i]=(char)('a'+k);
                arr[j]=(char)('a'+k);
                i++;
                j--;
                count[k]-=2;
            }
        }
        for(int k=0;k<26;k++){
            if(count[k]==1){
                arr[i]=(char)('a'+k);
                i++;
            }
        }
        return new String(arr);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna