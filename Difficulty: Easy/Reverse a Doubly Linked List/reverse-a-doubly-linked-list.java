/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node current = head;
        Node back = null;
        Node newHead = null;
        
        while(current != null){
            back = current.prev;
            current.prev = current.next;
            current.next = back;
            
            if(current.prev == null){
                newHead = current;
            }
            
            current = current.prev;
        }
        return newHead;
    }
}