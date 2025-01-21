// 1->2->3->4->5 = the Middle Node is 3 
// 1->2->3->4->5->6 = the Middle Node is 4 

class Solution {
    public ListNode middleNode(ListNode head) {

      ListNode fast = head;
      ListNode slow = head;
      ListNode temp = head;
      int count=0;
      while(temp!=null)
        {  
          count++;
          temp = temp.next;
        }

      while(fast.next !=null && fast.next.next!=null)
        {  
          fast = fast.next.next;
          slow = slow.next;
        }

      if(count%2==0)
          return slow.next;
      else
          return slow;
      
    }
}
