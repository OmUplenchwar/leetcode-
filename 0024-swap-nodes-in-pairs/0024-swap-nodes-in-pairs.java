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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=head.next;
        int count=0;
        ListNode ans=head.next;
        // if(ans==null) return head;
        ListNode one=head;
        ListNode two=head.next;
        while(one!=null && two!=null){
            ListNode temp=two.next;
            two.next=one;
            one.next=temp;
            if(count>0) prev.next=two;
            prev=one;
            one=temp;
            if(one!=null) two=one.next;
            
            count++;
            
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna