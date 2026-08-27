class Solution {
    public int maximumLengthSubstring(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str=s.substring(i,j+1);
                HashMap<Character,Integer> map=new HashMap<>();
                for(int k=0;k<str.length();k++){
                    map.put(str.charAt(k),map.getOrDefault(str.charAt(k),0)+1);
                }
                boolean flag=true;
                for(char c:map.keySet()){
                    if(map.get(c)>2){
                        flag=false;
                        break;
                    }
                }
                if(flag) ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna