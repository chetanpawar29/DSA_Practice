/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        if(head == null) return null;
        
         Node temp = head;
         
        if(x == 1){
            head = temp.next;
            return head;
        }
        
        Node prev = null;
        int count = 0;
        
        while(temp != null){
            count++;
            if(count == x){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            
            if(temp == null){
                return head;
            }
        }
        
        return head;
        
    }


}