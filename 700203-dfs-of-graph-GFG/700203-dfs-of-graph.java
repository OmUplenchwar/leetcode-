class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int[] visited=new int[adj.size()];
        visited[0]=1;
        helper(adj,list,0,visited);
        return list;
        
    }
    public void helper(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> list,int node,int[] visited){
        // if(visited[node]!=1){
            // visited[node]=1;
            list.add(node);
            List<Integer> temp=adj.get(node);
            for(int i=0;i<temp.size();i++){
                if(visited[temp.get(i)]!=1){
                    visited[temp.get(i)]=1;
                    helper(adj,list,temp.get(i),visited);
                }
            }
            
        // }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna