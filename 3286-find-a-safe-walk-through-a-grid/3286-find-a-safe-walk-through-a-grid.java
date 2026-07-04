class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int[][] visited=new int[grid.size()][grid.get(0).size()];
        int[][][] dp=new int[grid.size()][grid.get(0).size()][health+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        
        if(health<=0) return false;
        visited[0][0]=1;
        return helper(grid,health,visited,0,0,dp);
    }
    public boolean helper(List<List<Integer>> grid,int health,int[][] visited,int r,int c,int[][][] dp){
         if(r==grid.size()-1 && c==grid.get(0).size()-1){
              if(health-grid.get(r).get(c)>0) return true;
              else return false;
         }
         if(dp[r][c][health]!=-1) return dp[r][c][health]==1;
         if(health<=0){
            dp[r][c][health]=0;
            return false;
         }
         boolean one=false;
         boolean two=false;
         boolean three=false;
         boolean four=false;
         if(r<grid.size()-1 && visited[r+1][c]!=1){
            visited[r+1][c]=1;
            one=helper(grid,health-grid.get(r).get(c),visited,r+1,c,dp);
            visited[r+1][c]=0;
         }
         if(r>0 && visited[r-1][c]!=1){
            visited[r-1][c]=1;
            two=helper(grid,health-grid.get(r).get(c),visited,r-1,c,dp);
            visited[r-1][c]=0;
         }
         if(c<grid.get(0).size()-1 && visited[r][c+1]!=1){
            visited[r][c+1]=1;
            three=helper(grid,health-grid.get(r).get(c),visited,r,c+1,dp);
            visited[r][c+1]=0;
         }
         if(c>0 && visited[r][c-1]!=1){
            visited[r][c-1]=1;
            four=helper(grid,health-grid.get(r).get(c),visited,r,c-1,dp);
            visited[r][c-1]=0;
         }
         boolean ans=(one || two) || (three || four);
         if(ans){
            dp[r][c][health]=1;
         }else{
            dp[r][c][health]=0;
         }
         return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna