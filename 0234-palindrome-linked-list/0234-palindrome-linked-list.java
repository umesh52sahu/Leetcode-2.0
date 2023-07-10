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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverse(slow.next);
        ListNode temp=head;
        while(rev!=null){
            if(temp.val!=rev.val){
                return false;
            }
            temp=temp.next;
            rev=rev.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode after=null;
        while(curr!=null&&curr.next!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        curr.next=prev;
        return curr;
    }
}