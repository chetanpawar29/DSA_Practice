class Solution {
    public boolean isValid(String s) {

        char str[] = s.toCharArray();
        char open;

        Stack<Character> stack = new Stack<>();

        for(char ch : str)
        {
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }else{
                if(stack.empty()){
                    return false;
                }

                open = stack.peek(); 
                if(ch==')' && open != '('||ch==']' && open != '['||ch=='}' && open != '{') {
                    return false;
                }else{
                    stack.pop();
                }
                
            }
        }


        return stack.empty();
    }
}