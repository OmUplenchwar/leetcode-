class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int ans=0;
        int i=satisfaction.length-2;
        int[] arr=satisfaction;
        int total=arr[arr.length-1];
        ans+=arr[arr.length-1];
        if(ans<0) return 0;
        while(i>=0){
            if(ans+total+arr[i]<ans) return ans;
            ans=ans+total+arr[i];
            // System.out.println(ans);
            total+=arr[i];
            i--;
        }
        return ans;
    }
}
















       


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna