class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans=new int[A.length];
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<A.length;i++){
            map1.put(A[i],map1.getOrDefault(A[i],0)+1);
            map2.put(B[i],map2.getOrDefault(B[i],0)+1);
            int ans1=0;
            for(int x:map1.keySet()){
                if(map1.get(x)==map2.getOrDefault(x,0)){
                    ans1++;
                }
            }
            ans[i]=ans1;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna