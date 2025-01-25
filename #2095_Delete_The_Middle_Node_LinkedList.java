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
    public ListNode deleteMiddle(ListNode head) {

        ListNode prev = head;
        ListNode curr = head;
        ListNode temp = head;
        int i=0;
        int count=0;
        
        if(head.next==null)
        {
            return null;
        }
        while(temp!=null)
        {
            count++;
            temp = temp.next;
            
        }
        
    
        int midx = count/2;
        
        curr = head;
        while(curr !=null)
        {
            
            if(i==midx)
            {
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
            i++;

        }

        return head;
        
    }
}
