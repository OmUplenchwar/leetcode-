/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        List<Integer> list=new ArrayList<>();
        if(head==null || head.next==null || head.next.next==null) return ans;
        ListNode temp=head.next;
        int prev=head.val;
        int i=2;
        while(temp.next!=null){
            if(temp.val>prev && temp.val>temp.next.val){
                list.add(i);
            }
            if(temp.val<prev && temp.val<temp.next.val){
                list.add(i);
            }
            i++;
            prev=temp.val;
            temp=temp.next;
        }
        if(list.size()<2){
            return ans;
        }else{
            Collections.sort(list);
            ans[1]=list.get(list.size()-1)-list.get(0);
            int min=Integer.MAX_VALUE;
            for(int j=0;j<list.size()-1;j++){
                min=Math.min(min,list.get(j+1)-list.get(j));
            }
            ans[0]=min;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna