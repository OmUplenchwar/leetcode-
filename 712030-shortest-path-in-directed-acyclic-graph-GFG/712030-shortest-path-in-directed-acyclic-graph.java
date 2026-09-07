class Solution {
    public ArrayList<Integer> shortestPath(int V, int[][] edges) {
        // Code here
        List<List<List<Integer>>> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            List<List<Integer>> temp=new ArrayList<>();
            list.add(temp);
        }
        for(int i=0;i<edges.length;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(edges[i][1]);
            temp.add(edges[i][2]);
            list.get(edges[i][0]).add(temp);
        }
        Stack<Integer> stack=new Stack<>();
        int[] visited=new int[V];
        visited[0]=0;
        helper(list,stack,visited,0);
         int[] dist=new int[V];
    Arrays.fill(dist,Integer.MAX_VALUE);
    dist[0]=0;
    while(!stack.isEmpty()){
        int temp=stack.pop();
        int dis=dist[temp];
        List<List<Integer>> store=list.get(temp);
        for(int i=0;i<store.size();i++){
            dist[store.get(i).get(0)]=Math.min(dist[store.get(i).get(0)],dis+store.get(i).get(1));
        }
    }
    ArrayList<Integer> ans=new ArrayList<>();
    for(int x:dist){
        if(x==Integer.MAX_VALUE) ans.add(-1);
        else ans.add(x);
    }
    return ans;
        
        
    }
    public void helper(List<List<List<Integer>>> list,Stack<Integer> stack,int[] visited,int node){
            List<List<Integer>> temp=list.get(node);
            for(int i=0;i<temp.size();i++){
                if(visited[temp.get(i).get(0)]!=1){
                    visited[temp.get(i).get(0)]=1;
                    helper(list,stack,visited,temp.get(i).get(0));
                }
            }
            stack.push(node);
        
    }
   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna