class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int s1=0;
        int e=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(true){
               while(e<s.length() && map.size()<3){
            map.put(s.charAt(e),map.getOrDefault(s.charAt(e),0)+1);
            e++;
               }
               if(map.size()==3) ans=ans+(s.length()-e+1);
            //    else break;
               while(s1<e && map.size()==3){
                map.put(s.charAt(s1),map.get(s.charAt(s1))-1);
                if(map.get(s.charAt(s1))==0){
                    map.remove(s.charAt(s1));
                }
                if(map.size()==3) ans=ans+(s.length()-e+1);
                s1++;
               }
               if(e==s.length()) break;
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna