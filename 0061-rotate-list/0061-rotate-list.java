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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int count = 0;
        ListNode num = head;
        while(num != null){
            count++;
            num = num.next;
        }
        k = k%count;
        if(k==0){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        
        while(fast.next!=null){
            fast=fast.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=null;
        fast.next=head;
        return slow;
        
    }
}