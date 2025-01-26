//Brute-Force Approach , Converting the LinkedList to array -> then creating a dummy node -> Creating new nodes of the sortedlist and adding the arraylist values !
class Solution {
    public ListNode sortList(ListNode head) {

      if(head == null && head.next==null)
      {  
        return head;
      }        
      ArrayList <Integer> arr = new ArrayList<>();
      ListNode temp = head;
      while(temp!=null)
        {  
          arr.add(temp.val);
          temp = temp.next;
        }
      arr.sort(Integer ::compareTo);
      ListNode sortedlist = new ListNode(0);
      ListNode curr = head;
      for(int i=0; i<arr.size();i++)
        {  
          curr.next = new ListNode(arr.get(i));
          curr = curr.next;
        }
    }
}
