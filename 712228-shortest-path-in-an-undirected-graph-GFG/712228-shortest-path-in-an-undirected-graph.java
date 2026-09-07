class Solution {
    public ArrayList<Integer> shortestPath(int V, int[][] edges, int src, int dest) {
        // code here
        src=src-1;
        dest=dest-1;
        List<List<List<Integer>>> list=new ArrayList<>();
                for(int i=0;i<V;i++){
                    List<List<Integer>> temp=new ArrayList<>();
                    list.add(temp);
                }
                for(int i=0;i<edges.length;i++){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(edges[i][1]-1);
                    temp.add(edges[i][2]);
                    list.get(edges[i][0]-1).add(temp);

                    List<Integer> temp2 = new ArrayList<>();
                        temp2.add(edges[i][0]-1);
                        temp2.add(edges[i][2]);

                        list.get(edges[i][1]-1).add(temp2);
                }
                PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
                    if(a[1]!=b[1]) return a[1]-b[1];
                    else return a[0]-b[0];
                });
                
        int[] dist=new int[V];
        int[] parent=new int[V];
        Arrays.fill(parent,-1);
                Arrays.fill(dist,Integer.MAX_VALUE);
                dist[dest]=0;
                int[] arr=new int[2];
                arr[0]=dest;
                pq.add(arr);
                while(!pq.isEmpty()){
                    int[] temp=pq.poll();
                    if(dist[temp[0]]<temp[1]) continue;
                    List<List<Integer>> store=list.get(temp[0]);
                    for(int i=0;i<store.size();i++){
                        if(dist[store.get(i).get(0)]>temp[1]+store.get(i).get(1)){
                            dist[store.get(i).get(0)]=temp[1]+store.get(i).get(1);
                            int[] dummy={store.get(i).get(0),temp[1]+store.get(i).get(1)};
                            parent[store.get(i).get(0)]=temp[0];
                            pq.add(dummy);
                        }
                    }
                }
                
        ArrayList<Integer> ans=new ArrayList<>();
        if(dist[src]==Integer.MAX_VALUE){
            ans.add(-1);
            return ans;
        }
        int node=src;
        ans.add(src);
        while(node!=dest){
            int nextnode=Integer.MAX_VALUE;
            List<List<Integer>> temp=list.get(node);
            for(int i=0;i<temp.size();i++){
                if(dist[node]==dist[temp.get(i).get(0)]+temp.get(i).get(1)){
                    nextnode=Math.min(nextnode,temp.get(i).get(0));
                }
            }
            node=nextnode;
            ans.add(node);
        }
        // ans.add(src);
        // Collections.reverse(ans);
        for(int i=0;i<ans.size();i++){
            ans.set(i,ans.get(i)+1);
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna