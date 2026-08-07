class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> store=new ArrayList<>();
        for(int i=2;i<=9;i++){
            for(int j=1;j<=10-i;j++){
                int temp=i;
                int num=j;
                for(int k=j+1;k<=j+i-1;k++){
                    num=num*10+k;
                }
                store.add(num);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<store.size();i++){
            if(store.get(i)<=high && store.get(i)>=low){
                ans.add(store.get(i));
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna