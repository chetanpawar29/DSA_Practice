/* Structure of a Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if(head == null) return null;
        
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == x) break;
            temp = temp.next;
        }
        
        Node front = temp.next;
        Node back = temp.prev;
        
        
        if(front == null && back == null){
            return null;
        }else if(back == null){
            head = temp.next;
            temp.next = null;
            head.prev = null;
            return head;
        }else if(front == null){
            back.next = temp.next;
            temp.next = null;
            temp.prev = null;
            return head;
        }
        
        back.next = front;
        front.prev = back;
        
        temp.next = null;
        temp.prev = null;
        
        return head;
    }
}