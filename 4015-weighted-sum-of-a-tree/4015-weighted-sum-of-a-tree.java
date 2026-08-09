class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=1;i<parent.length;i++){
            adj.get(parent[i]).add(i);
        }
        int[] depth=new int[nums.length];
        int height=0;
        int d=1;
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            while(!q.isEmpty()){
                temp.add(q.poll());
            }
            for(int i=0;i<temp.size();i++){
                depth[temp.get(i)]=d;
            }
            d++;
            height++;
            for(int i=0;i<temp.size();i++){
                List<Integer> store=adj.get(temp.get(i));
                for(int j=0;j<store.size();j++){
                    q.add(store.get(j));
                }
            }
        }
        long ans=0L;
        for(int i=0;i<nums.length;i++){
            long temp=1L*nums[i]*(height-depth[i]+1);
            ans+=temp;
        }
        return ans;
    }
    
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna