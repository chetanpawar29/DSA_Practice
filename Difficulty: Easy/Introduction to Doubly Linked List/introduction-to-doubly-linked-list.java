// User function Template for Java
// class Node{
//     int data; 
//     Node next;
//     Node prev;
//     Node(int data, Node next, Node prev){
//         this.data = data;
//         this.next = next;
//         this.prev = prev;
//     }
    
//     Node(int data){
//         this.data = data;
//         next = null;
//         prev = null;
//     }
// }

class Solution {
    
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]);
        Node mover = head;
        
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            temp.prev = mover;
            mover.next = temp;
            mover = temp;
        }
        
        return head;
    }
}