class Solution {
    public int shortestPath(int n, int[][] edges, int src, int dest) {
        // code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer> node=new LinkedList<>();
        Queue<Integer> dist=new LinkedList<>();
        int[] visited=new int[n];
        node.add(src);
        dist.add(0);
        visited[src]=1;
        while(!node.isEmpty()){
            int tn=node.poll();
            int td=dist.poll();
            if(tn==dest) return td;
            List<Integer> temp=adj.get(tn);
            for(int i=0;i<temp.size();i++){
                if(visited[temp.get(i)]!=1){
                    visited[temp.get(i)]=1;
                    node.add(temp.get(i));
                    dist.add(td+1);
                }
            }
            
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna