class Solution {
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        // code here
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
            
            List<Integer> temp2 = new ArrayList<>();
                temp2.add(edges[i][0]);
                temp2.add(edges[i][2]);

                list.get(edges[i][1]).add(temp2);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1]) return a[1]-b[1];
            else return a[0]-b[0];
        });
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        int[] arr=new int[2];
        arr[0]=src;
        pq.add(arr);
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            if(dist[temp[0]]<temp[1]) continue;
            List<List<Integer>> store=list.get(temp[0]);
            for(int i=0;i<store.size();i++){
                if(dist[store.get(i).get(0)]>temp[1]+store.get(i).get(1)){
                    dist[store.get(i).get(0)]=temp[1]+store.get(i).get(1);
                    int[] dummy={store.get(i).get(0),temp[1]+store.get(i).get(1)};
                    pq.add(dummy);
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:dist){
            if(x==Integer.MAX_VALUE) ans.add(-1);
            else ans.add(x);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna