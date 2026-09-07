class Solution {
    public int minimumEffortPath(int[][] arr) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            return a[0]-b[0];
        });
        int[][] dist=new int[arr.length][arr[0].length];
        for(int i=0;i<dist.length;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[0][0]=0;
        int[] temp={0,0,0};
        pq.add(temp); 
        while(!pq.isEmpty()){
            int[] store=pq.poll();
            int r=store[1];
            int c=store[2];
            int d=store[0];
            if(r<arr.length-1){
                if(dist[r+1][c]>Math.max(d,Math.abs(arr[r][c]-arr[r+1][c]))){
                     dist[r+1][c]=Math.max(d,Math.abs(arr[r][c]-arr[r+1][c]));
                     int[] dummy={dist[r+1][c],r+1,c};
                     pq.add(dummy);
                }
            }
            if(r>0){
                if(dist[r-1][c]>Math.max(d,Math.abs(arr[r][c]-arr[r-1][c]))){
                     dist[r-1][c]=Math.max(d,Math.abs(arr[r][c]-arr[r-1][c]));
                     int[] dummy={dist[r-1][c],r-1,c};
                     pq.add(dummy);
                }
            }
            if(c<arr[0].length-1){
                if(dist[r][c+1]>Math.max(d,Math.abs(arr[r][c]-arr[r][c+1]))){
                     dist[r][c+1]=Math.max(d,Math.abs(arr[r][c]-arr[r][c+1]));
                     int[] dummy={dist[r][c+1],r,c+1};
                     pq.add(dummy);
                }
            }
            if(c>0){
               if(dist[r][c-1]>Math.max(d,Math.abs(arr[r][c]-arr[r][c-1]))){
                     dist[r][c-1]=Math.max(d,Math.abs(arr[r][c]-arr[r][c-1]));
                     int[] dummy={dist[r][c-1],r,c-1};
                     pq.add(dummy);
                } 
            }

        }
        return dist[arr.length-1][arr[0].length-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna