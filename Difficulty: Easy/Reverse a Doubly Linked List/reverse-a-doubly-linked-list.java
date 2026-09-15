/* Structure of Doubly Linked List Node
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
        Node temp = head;
        Node pre = null;
        while(temp!=null){
            pre = temp.prev;
            temp.prev = temp.next;
            temp.next = pre;
            temp = temp.prev;
        }
        
        return pre.prev;
    }
}