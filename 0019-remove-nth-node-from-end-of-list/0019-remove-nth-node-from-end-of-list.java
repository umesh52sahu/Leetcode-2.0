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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        if(head==null){
            return head;
        }
       
        for(int i=1;i<n;i++){
            fast=fast.next;
        }
        
        while(fast.next!=null){
            fast=fast.next;
            prev=slow;
            slow=slow.next;
            
        }
        if(prev==null){
            head=slow.next;
        } else if(n==1){
            prev.next=null;   
        } else{
            prev.next=slow.next;
        }
        return head;
        
    }
}