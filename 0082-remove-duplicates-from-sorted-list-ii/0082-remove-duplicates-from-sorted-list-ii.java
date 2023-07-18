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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode headf=new ListNode(0);
        ListNode temp=headf;
        ListNode pr=head;
        ListNode ch=head.next;
        
        while(ch!=null){
            if(pr.val!=ch.val){
                headf.next=pr;
                headf=headf.next;
                headf.next=null;
                pr=ch;
                ch=ch.next;
            } else{
                while(ch!=null&&pr.val==ch.val){
                    ch=ch.next;
                }
                pr=ch;
                if(ch!=null){
                    ch=ch.next;
                }
                    
            }
        }
        headf.next=pr;
        return temp.next;
    }
}