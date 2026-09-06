class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        int[][] pre=prerequisites;
        for(int i=0;i<prerequisites.length;i++){
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] visited=new int[numCourses];
        int[] pvisited=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(visited[i]!=1){
                if(traverse(prerequisites,visited,pvisited,i,list)) return false;
            } 
        }
        return true;
    }
    public boolean traverse(int[][] pre,int[] visited,int[] pvisited,int node,List<List<Integer>> list){
        
            visited[node]=1;
            pvisited[node]=1;
            List<Integer> temp=list.get(node);
            for(int i=0;i<temp.size();i++){
                int tempnode=temp.get(i);
                if(visited[tempnode]==1){
                    if(pvisited[tempnode]==1) return true;
                }else{
                    if(traverse(pre,visited,pvisited,tempnode,list)) return true;
                }
            }
            pvisited[node]=0;
            return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna