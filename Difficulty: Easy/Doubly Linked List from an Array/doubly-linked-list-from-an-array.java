/* class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
} */

class Solution {
    public Node createDLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node mover = head;
        
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = mover.next;
            
        }
        return head;
    }
}