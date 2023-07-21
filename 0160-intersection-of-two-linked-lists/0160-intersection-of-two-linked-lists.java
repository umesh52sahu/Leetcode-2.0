/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a1 = headA;
        ListNode a2 = headB;
        int c1 = 0;
        int c2 = 0;
        while(a1 != null){
            c1++;
            a1 = a1.next;
        }
        
        while(a2 != null){
            c2++;
            a2 = a2.next;
        }
        System.out.println(c1+" "+c2);
        
        if(c1>c2){
            a1 = headA;
            for(int i = 0; i < Math.abs(c1-c2); i++){
                a1 = a1.next;
            } 
            a2 = headB;
        } else{
            a2 = headB;
            for(int i = 0; i < (c2-c1); i++){
                a2 = a2.next;
            }
            a1 = headA;
        }
            while(a1 != null){
                if(a1 == a2){
                    break;
                }
                a1=a1.next;
                a2=a2.next;
            }
        return a2;
    }
}