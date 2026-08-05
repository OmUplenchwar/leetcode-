class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj=new ArrayList<>();
        // HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<invocations.length;i++){
            adj.get(invocations[i][0]).add(invocations[i][1]);
            // set.add(invocations[i][0]+""+invocations[i][1]);
        }
        List<Integer> sus=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int[] visited=new int[n];
        visited[k]=1;
        q.add(k);
        while(!q.isEmpty()){
            int temp=q.poll();
            sus.add(temp);
            List<Integer> list=adj.get(temp);
            for(int j=0;j<list.size();j++){
                if(visited[list.get(j)]!=1){
                    q.add(list.get(j));
                    visited[list.get(j)]=1;
                }
            }
        }
        HashSet<Integer> set1=new HashSet<>(sus);
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set1.contains(i)) continue;
            set2.add(i);
        }
        for(int i=0;i<invocations.length;i++){
            if(set2.contains(invocations[i][0]) && set1.contains(invocations[i][1])){
               List<Integer> store=new ArrayList<>();
               for(int j=0;j<n;j++){
                store.add(j);
               }
               return store;
            }
        }
        return new ArrayList<>(set2);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna