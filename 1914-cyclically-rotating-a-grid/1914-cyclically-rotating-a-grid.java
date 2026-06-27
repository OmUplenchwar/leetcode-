class Solution {
    public int[][] rotateGrid(int[][] grid, int s) {
        int rs=0;
        int re=grid.length-1;
        int cs=0;
        int ce=grid[0].length-1;
        while(rs<re && cs<ce){
            int l=2*(re-rs+1)+2*(ce-cs+1)-4;
            int[] arr=new int[l];
            int k=0;
            for(int i=cs;i<=ce;i++){
                arr[k]=grid[rs][i];
                k++;
            }
            for(int i=rs+1;i<=re;i++){
                arr[k]=grid[i][ce];
                k++;
            }
            for(int i=ce-1;i>=cs;i--){
                arr[k]=grid[re][i];
                k++;
            }
            for(int i=re-1;i>rs;i--){
                arr[k]=grid[i][cs];
                k++;
            }
            System.out.println(Arrays.toString(arr));
            int temp=s%arr.length;
            helper(arr,0,temp-1);
            helper(arr,temp,arr.length-1);
            helper(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));
            k=0;
            for(int i=cs;i<=ce;i++){
                grid[rs][i]=arr[k];
                k++;
            }
            for(int i=rs+1;i<=re;i++){
                grid[i][ce]=arr[k];
                k++;
            }
            for(int i=ce-1;i>=cs;i--){
                grid[re][i]=arr[k];
                k++;
            }
            for(int i=re-1;i>rs;i--){
                grid[i][cs]=arr[k];
                k++;
            }
            rs++;
            re--;
            cs++;
            ce--;
        }
        return grid;

    }
    public void helper(int[] arr,int s,int e){
        int i=s;
        int j=e;
        while(i<j){
            int temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
            i++;
            j--;
        }
        return;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna