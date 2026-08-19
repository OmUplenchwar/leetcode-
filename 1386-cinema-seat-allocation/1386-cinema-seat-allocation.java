class Solution {
    public int maxNumberOfFamilies(int n, int[][] arr) {
        HashSet<String> map=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            map.add(arr[i][0]+""+arr[i][1]);
            set.add(arr[i][0]);
        }
        int ans=0;
        ans+=((n-set.size())*2);
        for(int x:set){
            boolean flag1=true;
             for(int i=2;i<=5;i++){
                if(!map.contains(x+""+i)) continue;
                else flag1=false;
             }
             if(flag1){
                ans++;
                boolean flag2=true;
                for(int i=6;i<=9;i++){
                    if(!map.contains(x+""+i)) continue;
                    else flag2=false;
                }
                if(flag2) ans++;
             }else{
                boolean flag2=true;
                for(int i=4;i<=7;i++){
                    if(!map.contains(x+""+i)) continue;
                    else flag2=false;
                }
                if(flag2) ans++;
                else{
                     boolean flag3=true;
                for(int i=6;i<=9;i++){
                    if(!map.contains(x+""+i)) continue;
                    else flag3=false;
                }
                if(flag3) ans++;
                }
             }
        }
        return ans;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna