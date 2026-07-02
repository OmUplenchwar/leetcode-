class Solution {
    public String getPermutation(int n, int k) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        int[] vis=new int[n+1];
        List<Integer> temp=new ArrayList<>();
        helper(0,arr,vis,0,temp,k);
        return Integer.toString(temp.get(k-1));


    }
    public void helper(int idx,int[] arr,int[] vis,int num,List<Integer> temp,int k){
        if(temp.size()==k) return;
        if(idx==arr.length){
            temp.add(num);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(vis[arr[i]]!=1){
                vis[arr[i]]=1;
                helper(idx+1,arr,vis,num*10+arr[i],temp,k);
                vis[arr[i]]=0;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna