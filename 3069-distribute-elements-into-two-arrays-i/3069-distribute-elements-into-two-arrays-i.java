class Solution {
    public int[] resultArray(int[] nums) {
        int[] ans=new int[nums.length];
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        for(int i=0;i<arr1.size();i++){
            ans[i]=arr1.get(i);
        }
        int j=0;
        for(int i=arr1.size();i<ans.length;i++){
            ans[i]=arr2.get(j);
            j++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna