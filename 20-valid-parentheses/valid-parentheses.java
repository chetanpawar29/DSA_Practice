class Solution {
    public boolean isValid(String s) {

        char str[] = s.toCharArray();
        char opening;

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
                if(ch == ')'){
                opening = '(';

                if(opening != stack.peek())
                {
                    return false;
                }else{
                     stack.pop();
                }
            }else if(ch == ']'){
                opening = '[';

                if(opening != stack.peek())
                {
                    return false;
                }else{
                     stack.pop();
                }
            }else if(ch == '}'){
                opening = '{';

                if(opening != stack.peek())
                {
                    return false;
                }else{
                     stack.pop();
                }
            } 
        }
        }


        return stack.empty();
    }
}