/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Map<Node, Integer> map = new HashMap<>();
        Node temp = head;
        int index = 0;
        while(temp!=null){
            if(map.containsKey(temp)){
                return (index - map.get(temp));
            }
            map.put(temp, index);
            index++;
            temp = temp.next;
        }
        
        return 0;
    }
}