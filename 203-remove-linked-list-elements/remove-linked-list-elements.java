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
    public ListNode removeElements(ListNode head, int k) {
        if(head == null)  return head;
        
        int count = 0; 
        ListNode temp = head;
        ListNode prev = null;

        while(temp.val == k && temp == head)
        {
                head = head.next;
                if(temp.next != null)
                {
                    temp = temp.next;
                }else{
                    break;
                }
        }
        
         while (temp != null) {
            if (temp.val == k) {
            if (prev != null) {
            prev.next = temp.next;
            }
            temp = temp.next;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        
        
        
        return head;
    }
}