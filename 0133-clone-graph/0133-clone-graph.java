/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        List<List<Integer>> adj=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        int[] visited=new int[101];
        for(int i=0;i<101;i++){
            adj.add(new ArrayList<>());
        }
        if(node==null) return null;
        q.add(node);
        visited[node.val]=1;
        while(!q.isEmpty()){
            Node n=q.poll();
            List<Node> list=n.neighbors;
            for(int i=0;i<list.size();i++){
                adj.get(n.val).add(list.get(i).val);
               if(visited[list.get(i).val]==1) continue;
               q.add(list.get(i));
            //    adj.get(n.val).add(list.get(i).val);
               visited[list.get(i).val]=1;
            }
        }
        Node[] arr=new Node[101];
        for(int i=1;i<101;i++){
             Node temp=new Node();
             temp.val=i;
             temp.neighbors=new ArrayList<>();
             arr[i]=temp;
        }
        for(int i=0;i<adj.size();i++){
            if(adj.get(i).size()==0) continue;
            List<Integer> demo=adj.get(i);
            Node store=arr[i];
            for(int j=0;j<demo.size();j++){
                store.neighbors.add(arr[demo.get(j)]);
            }
        }
        return arr[node.val];

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna