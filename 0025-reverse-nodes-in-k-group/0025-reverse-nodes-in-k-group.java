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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        
        if(head == null || length < k){
            return head;
        }
        temp = head;
        ListNode curr = head, prev = null, fwd = head;
        int count = 0;
        while(count < k){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            count++;
        }
        
        ListNode ans = reverseKGroup(curr , k);
        temp.next = ans;
        return prev;
        
        
    }
}