// User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node insertionSort(Node head) {
        // code here
        Node temp1 = head;
        while(temp1.next != null){
            Node temp2 = temp1;
            Node min = temp1;
            
            while(temp2 != null){
                if(min.data > temp2.data){
                    min = temp2;
                }
                temp2 = temp2.next;
            }
            
            int ele = min.data;
            min.data = temp1.data;
            temp1.data = ele;
            
            temp1 = temp1.next;
        }
        return head;
    }
}