class Solution {
    public int similarPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            HashSet<Character> set=new HashSet<>();
            String temp=words[i];
            for(int j=0;j<temp.length();j++){
                set.add(temp.charAt(j));
            }
            for(int j=i+1;j<words.length;j++){
                HashSet<Character> set1=new HashSet<>();
                String temp1=words[j];
                for(int k=0;k<temp1.length();k++){
                   set1.add(temp1.charAt(k));
                }
                if(set1.size()!=set.size()) continue;
                boolean flag=true;
                for(char demo:set1){
                    if(!set.contains(demo)){
                        flag=false;
                        break;
                    }
                }   
                if(flag) ans++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna