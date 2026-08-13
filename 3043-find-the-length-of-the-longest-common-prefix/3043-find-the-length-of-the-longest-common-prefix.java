class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            int temp=arr1[i];
            while(temp>0 && !set.contains(temp)){
                set.add(temp);
                temp=temp/10;
            }
        }
        int ans=0;
        for(int i=0;i<arr2.length;i++){
            int temp=arr2[i];
            while(temp>0){
                if(set.contains(temp)){
                    ans=Math.max(ans,(int)Math.log10(temp)+1);
                    break;
                }
                temp=temp/10;
            }
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna