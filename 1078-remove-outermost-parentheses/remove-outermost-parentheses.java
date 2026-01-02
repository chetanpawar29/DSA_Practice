class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(!stack.isEmpty()) sb.append(ch);
                stack.push(ch);
            }else{
                stack.pop();
                if(!stack.isEmpty()) sb.append(ch);
                
            }
        }

        return sb.toString();
    }
}