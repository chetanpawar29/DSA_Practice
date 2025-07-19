// User function Template for Java

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete {
    Node deleteHead(Node head) {
        // Your code here
        Node temp = head;
        head = temp.next;
        
        return head;
        
    }
}