/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        Node curr = null;
        
        while( temp != null){
            Node dummy = new Node(temp.val);
            curr = temp.next;
            temp.next = dummy;
            dummy.next = curr;
            temp = curr;
        }
        // Node ch = head;
        // while(ch != null ){
        //     System.out.println(ch.val);
        //     ch=ch.next;
        // }
        
        Node ans = new Node(0);
        Node fans=ans;
        temp = head;
        while(temp != null && temp.next != null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            } 
            System.out.println(temp.val);
            temp=temp.next.next;
            
                // ans.next = temp.next;
                // ans=ans.next;
                // Node temp2 = temp.next;
                // temp.next=temp.next.next;
                // temp2.next = null;
                // temp=temp.next;
            
        }
        temp  = head;
        
        while(temp != null && temp.next != null){
                ans.next = temp.next;
                ans=ans.next;
                Node temp2 = temp.next;
                temp.next=temp.next.next;
                temp2.next = null;
                temp=temp.next;
        }
        // temp.next = null;
        // Node ch = fans.next;
        // while(ch != null ){
        //     System.out.println(ch.val);
        //     ch=ch.next;
        // }
        return fans.next;
    }
}