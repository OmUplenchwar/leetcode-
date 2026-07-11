class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int[] visited=new int[n];
        int[] degree=new int[n];
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
            degree[edges[i][0]]++;
            degree[edges[i][1]]++;
            set.add(Arrays.toString(edges[i]));
            String sb=edges[i][1]+""+edges[i][0];
            set.add(sb);
        }
        // System.out.println(list);
        int ans=0;
        for(int i=0;i<n;i++){
            if(visited[i]!=1){
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                visited[i]=1;
                List<Integer> arr=new ArrayList<>();
                arr.add(i);
                while(!q.isEmpty()){
                    List<Integer> temp=list.get(q.poll());
                    for(int j=0;j<temp.size();j++){
                        if(visited[temp.get(j)]==0){
                            q.add(temp.get(j));
                            visited[temp.get(j)]=1;
                            arr.add(temp.get(j));
                        }
                    }
                }
                boolean flag=true;
                // System.out.println(arr);
                // for(int j=0;j<arr.size()-1;j++){
                //     for(int k=j+1;k<arr.size();k++){
                //         int[] d= {arr.get(j),arr.get(k)};
                //         if(!set.contains(Arrays.toString(d))){
                //           flag=false;
                //         }

                //     }
                // }
               
                for(int j=0;j<arr.size();j++){
                    if(degree[arr.get(j)]!=arr.size()-1) flag=false;
                }
                if(flag) ans++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna