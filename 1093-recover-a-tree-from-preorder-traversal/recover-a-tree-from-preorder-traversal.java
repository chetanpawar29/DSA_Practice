/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        Stack<TreeNode> stack = new Stack<>();
        int index = 0, n = traversal.length();
        
        while (index < n) {
            int depth = 0;
            // Count the number of dashes to determine depth
            while (index < n && traversal.charAt(index) == '-') {
                depth++;
                index++;
            }
            
            // Extract the node value
            int numStart = index;
            while (index < n && Character.isDigit(traversal.charAt(index))) {
                index++;
            }
            int val = Integer.parseInt(traversal.substring(numStart, index));
            TreeNode node = new TreeNode(val);
            
            // Adjust stack size to match depth
            while (stack.size() > depth) {
                stack.pop();
            }
            
            // Attach to the parent
            if (!stack.isEmpty()) {
                if (stack.peek().left == null) {
                    stack.peek().left = node;
                } else {
                    stack.peek().right = node;
                }
            }
            
            // Push the new node onto the stack
            stack.push(node);
        }
        
        // The root of the tree is the first element in the stack
        while (stack.size() > 1) {
            stack.pop();
        }
        return stack.pop();
    }
}
