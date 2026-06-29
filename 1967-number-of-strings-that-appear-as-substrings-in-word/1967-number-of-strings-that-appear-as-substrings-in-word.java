class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<word.length();j++){
              sb.append(word.charAt(j));
              set.add(sb.toString());
            }
        }
        int ans=0;
        for(int i=0;i<patterns.length;i++){
            if(set.contains(patterns[i])) ans++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna