class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<series1.length;i++){
            map1.put(series1[i][0],series1[i][1]);
        }
        for(int i=0;i<series2.length;i++){
            map2.put(series2[i][0],series2[i][1]);
        }
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<series1.length;i++){
            list1.add(series1[i][0]);
        }
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<series2.length;i++){
            list2.add(series2[i][0]);
        }
        for(int i=0;i<series1.length;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(series1[i][0]);
            int idx=Collections.binarySearch(list2,series1[i][0]);
            if(idx<0){
                idx+=1;
                idx*=-1;
            }
            if(idx==list2.size()){
                temp.add(series1[i][1]);
                ans.add(temp);
                continue;
            }
            temp.add(series1[i][1]+series2[idx][1]);
            ans.add(temp);
        }
        for(int i=0;i<series2.length;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(series2[i][0]);
            int idx=Collections.binarySearch(list1,series2[i][0]);
            if(idx<0){
                idx+=1;
                idx*=-1;
            }
            if(idx==list1.size()){
                temp.add(series2[i][1]);
                ans.add(temp);
                continue;
            }
            temp.add(series2[i][1]+series1[idx][1]);
            ans.add(temp);
        }
        Collections.sort(ans,(a,b)->Integer.compare(a.get(0),b.get(0)));
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<ans.size();i++){
            map.put(ans.get(i).get(0),ans.get(i).get(1));
        }
        List<List<Integer>> answer=new ArrayList<>();
        for(int x:map.keySet()){
            List<Integer> temp=new ArrayList<>();
            temp.add(x);
            temp.add(map.get(x));
            answer.add(temp);
        }
        Collections.sort(answer,(a,b)->Integer.compare(a.get(0),b.get(0)));
        return answer;
            
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna