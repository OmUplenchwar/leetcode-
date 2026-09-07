class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] visited=new int[grid.length][grid[0].length];
        for(int i=0;i<visited.length;i++){
            Arrays.fill(visited[i],-1);
        }
        if(grid[0][0]==1) return -1;
        Queue<Integer> row=new LinkedList<>();
        Queue<Integer> col=new LinkedList<>();
        Queue<Integer> len=new LinkedList<>();
        row.add(0);
        col.add(0);
        len.add(1);
        visited[0][0]=1;
        while(!row.isEmpty()){
            int r=row.poll();
            int c=col.poll();
            int l=len.poll();
            if(r==grid.length-1 && c==grid[0].length-1) return l;
            if((r<grid.length-1 && grid[r+1][c]==0)&& visited[r+1][c]!=1){
                row.add(r+1);
                col.add(c);
                len.add(l+1);
                visited[r+1][c]=1;
            }
            if((c<grid[0].length-1 && grid[r][c+1]==0)&& visited[r][c+1]!=1){
                row.add(r);
                col.add(c+1);
                len.add(l+1);
                visited[r][c+1]=1;
            }
            if((r>0 && grid[r-1][c]==0)&& visited[r-1][c]!=1){
                row.add(r-1);
                col.add(c);
                len.add(l+1);
                visited[r-1][c]=1;
            }
            if((c>0 && grid[r][c-1]==0)&& visited[r][c-1]!=1){
                row.add(r);
                col.add(c-1);
                len.add(l+1);
                visited[r][c-1]=1;
            }
            if((c<grid[0].length-1 && r<grid.length-1)&& (grid[r+1][c+1]==0 && visited[r+1][c+1]!=1)){
                row.add(r+1);
                col.add(c+1);
                len.add(l+1);
                visited[r+1][c+1]=1;
            }
            if((c<grid[0].length-1 && r>0)&& (grid[r-1][c+1]==0 && visited[r-1][c+1]!=1)){
                row.add(r-1);
                col.add(c+1);
                len.add(l+1);
                visited[r-1][c+1]=1;
            }
            if((c>0 && r<grid.length-1)&& (grid[r+1][c-1]==0 && visited[r+1][c-1]!=1)){
                row.add(r+1);
                col.add(c-1);
                len.add(l+1);
                visited[r+1][c-1]=1;
            }
            if((c>0 && r>0)&& (grid[r-1][c-1]==0 && visited[r-1][c-1]!=1)){
                row.add(r-1);
                col.add(c-1);
                len.add(l+1);
                visited[r-1][c-1]=1;
            }


        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna