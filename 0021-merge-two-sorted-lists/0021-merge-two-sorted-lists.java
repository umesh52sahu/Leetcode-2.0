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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headf=null;
        ListNode s1=null;
        ListNode s2=null;
        if(list1==null&&list2==null){
            return list1;
        } else if(list1==null&&list2!=null){
            return list2;
        } else if(list1!=null&&list2==null) {
            return list1;
        } else{
                if(list1.val<list2.val){
                    headf=list1;
                    s1=list1.next;
                    s2=list2;
                } else{
                    headf=list2;
                    s1=list1;
                    s2=list2.next;
                }
            ListNode temp=headf;
            while(s1!=null&&s2!=null){
                if(s1.val<s2.val){
                    headf.next=s1;
                    s1=s1.next;
                }  else{
                    headf.next=s2;
                    s2=s2.next;
                }
                    headf=headf.next;
            }
            if(s1!=null){
                headf.next=s1;
            } 

            if(s2!=null){
                headf.next=s2;
            }
            return temp;
        }

    }
}