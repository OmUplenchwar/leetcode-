class Solution {
    public int[] maxValue(int[] nums) {
        int[] big=new int[nums.length];
        int max=nums[0];
        big[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            big[i]=Math.max(max,nums[i]);
            if(max<nums[i]) max=nums[i];
        }
        int[] small=new int[nums.length];
        small[nums.length-1]=nums.length-1;
        int min=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            small[i]=min;
            if(nums[i]<=nums[min]){
                min=i;
            }
            
        }
        System.out.println(Arrays.toString(small));
        int[] temp=new int[nums.length];
        temp[nums.length-1]=big[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(big[i]<=nums[small[i]]){
                temp[i]=big[i];
            }else{
                temp[i]=temp[i+1];
            }
        }
        return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna