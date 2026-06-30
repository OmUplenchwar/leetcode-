class Solution {
    public boolean canReach(int[] arr, int start) {
        int[] visited=new int[arr.length];
        int i=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visited[start]=1;
        while(!q.isEmpty()){
            int temp=q.poll();
            int idx1=temp+arr[temp];
            if(arr[temp]==0) return true;
            if(idx1<arr.length && visited[idx1]!=1){
                q.add(idx1);
                visited[idx1]=1;
            } 
            int idx2=temp-arr[temp]; 
            if(idx2>-1 && visited[idx2]!=1){
                q.add(idx2);
                visited[idx2]=1;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna