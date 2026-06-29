class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        int[][] arr=occupiedIntervals;
        Arrays.sort(arr,(a,b)->(Integer.compare(a[0],b[0])));
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<occupiedIntervals.length-1;i++){
              if(arr[i][1]+1<arr[i+1][0]){
                 ArrayList<Integer> temp=new ArrayList<>();
                 temp.add(arr[i][0]);
                 temp.add(arr[i][1]);
                 ans.add(temp);
              }else{
                arr[i+1][0]=arr[i][0];
                arr[i+1][1]=Math.max(arr[i][1],arr[i+1][1]);
              }
        }
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(arr[arr.length-1][0]);
        temp.add(arr[arr.length-1][1]);
        ans.add(temp);
        // System.out.println(ans);
        HashMap<Integer,Integer> map=new HashMap<>();
        int fs=freeStart;
        int fe=freeEnd;
        for(int i=0;i<ans.size();i++){
            int a=ans.get(i).get(0);
            int b=ans.get(i).get(1);
            if(a<fs && b<fs){
                map.put(a,b);
                continue;
            }
            if(a>fe && b>fe){
                map.put(a,b);
                continue;
            }
            if(a<fs && b<=fe){
                map.put(a,fs-1);
                continue;
            }
            if((a>=fs && a<=fe) && fe<b){
                map.put(fe+1,b);
                continue;
            }
            if(a>=fs && b<=fe){
                continue;
            }
            if(a<fs && b>fe){
                map.put(a,fs-1);
                map.put(fe+1,b);
            }
            
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int x:map.keySet()){
            List<Integer> temp1=new ArrayList<>();
            temp1.add(x);
            temp1.add(map.get(x));
            list.add(temp1);
        }
        Collections.sort(list,(a,b)->Integer.compare(a.get(0),b.get(0)));
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna