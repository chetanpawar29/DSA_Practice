/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        
        
        int count = 0;
        Node temp = head;
        
        while(temp != null){
            if(count == p) break;
            count++;
            temp = temp.next;
        }
        
        Node front = temp.next;
        
        if(front == null){
            Node newNode = new Node(x);
            newNode.prev = temp;
            temp.next = newNode;
            return head;
        }
        
        Node newNode = new Node(x);
        front.prev = newNode;
        newNode.next = front;
        newNode.prev = temp;
        temp.next = newNode;
        
        return head;
    }
}