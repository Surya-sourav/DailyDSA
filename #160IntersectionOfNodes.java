// Using the HashSet Datastructure !
  public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      HashSet <ListNode> st = new HashSet<>();
      while(headA!=null)
        {  
          st.add(headA);
          headA = headA.next;
        }
      while(headB !=null)
        {
          if(st.contains(headB)) return headB;
          headB = headB.next;
        }
      return null;
    }
}
