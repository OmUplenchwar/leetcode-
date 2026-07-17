class Solution {
    public List<String> printVertically(String s) {
        List<String> ans=new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        Queue<Integer> idx=new LinkedList<>();
        String[] split=s.split(" ");
        int max=0;
        for(int i=0;i<split.length;i++){
            q.add(split[i]);
            idx.add(0);
            max=Math.max(max,split[i].length());
        }
        while(max>0){
            int temp=q.size();
            StringBuilder sb=new StringBuilder();
            while(temp>0){
               String str=q.poll();
               int x=idx.poll();
               if(x<str.length()){
                sb.append(str.charAt(x));
               }else{
                sb.append(" ");
               }
               x++;
               q.add(str);
               idx.add(x);
               temp--;
            }
            ans.add(sb.toString());
            max--;
        }
        for(int i=0;i<ans.size();i++){
            String dummy=ans.get(i);
            dummy=dummy.stripTrailing();
            ans.set(i,dummy);
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna