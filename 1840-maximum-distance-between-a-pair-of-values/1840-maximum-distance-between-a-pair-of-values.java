class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans=0;
        int i=nums1.length-1;
        int j=nums2.length-1;
        while(i>=0 && j>=0){
            if(nums1[i]<=nums2[j]){
                ans=Math.max(ans,j-i);
                i--;  
            }else{
                j--;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna