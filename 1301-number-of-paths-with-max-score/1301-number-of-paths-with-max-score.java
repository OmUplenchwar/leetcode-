class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int[][] dp=new int[board.size()][board.get(0).length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int store=helper(0,0,dp,board);
        int[] ans=new int[2];
        if(store<0) return ans;
        int[][][] dp1=new int[board.size()][board.get(0).length()][2001];
        for(int i=0;i<dp1.length;i++){
            for(int j=0;j<dp1[0].length;j++){
                Arrays.fill(dp1[i][j],-1);
            }
        }
        ans[0]=store;
        ans[1]=helper1(0,0,dp1,board,2000,store);
        return ans;

    }
    public int helper(int r,int c,int[][] dp,List<String> board){
        if(r==board.size()-1 && c==board.get(0).length()-1){
            return '0'-'S';
        }
        if(dp[r][c]!=-1) return dp[r][c];
        int one=Integer.MIN_VALUE;
        int two=Integer.MIN_VALUE;
        int three=Integer.MIN_VALUE;
        if(r<board.size()-1 && board.get(r+1).charAt(c)!='X'){
           one=board.get(r+1).charAt(c)-'0'+helper(r+1,c,dp,board);
          
        }
        if(c<board.get(0).length()-1 && board.get(r).charAt(c+1)!='X'){
            two=board.get(r).charAt(c+1)-'0'+helper(r,c+1,dp,board);
          
        }
        if(r<board.size()-1 && (c<board.get(0).length()-1 && board.get(r+1).charAt(c+1)!='X')){
             three=board.get(r+1).charAt(c+1)-'0'+helper(r+1,c+1,dp,board);
         
        }
        dp[r][c]=Math.max(one,Math.max(two,three));
        return dp[r][c];
    }
    public int helper1(int r,int c,int[][][] dp,List<String> board,int sum,int store){
        if(r==board.size()-1 && c==board.get(0).length()-1){
            sum+=('S'-'0');
            if(sum==2000-store) return 1;
            else return 0;
        }
        if(dp[r][c][sum]!=-1) return dp[r][c][sum];
        int one=0;
        int two=0;
        int three=0;
        if(r<board.size()-1 && board.get(r+1).charAt(c)!='X'){
            int temp=(sum-(board.get(r+1).charAt(c)-'0'));
           one=helper1(r+1,c,dp,board,temp,store)%1000000007;
        }
        if(c<board.get(0).length()-1 && board.get(r).charAt(c+1)!='X'){
            int temp=(sum-(board.get(r).charAt(c+1)-'0'));
            two=helper1(r,c+1,dp,board,temp,store)%1000000007;
        }
        if(r<board.size()-1 && (c<board.get(0).length()-1 && board.get(r+1).charAt(c+1)!='X')){
            int temp=(sum-(board.get(r+1).charAt(c+1)-'0'));
             three=helper1(r+1,c+1,dp,board,temp,store)%1000000007;
        }
        dp[r][c][sum]=(one+two+three)%1000000007;
        return dp[r][c][sum];
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna