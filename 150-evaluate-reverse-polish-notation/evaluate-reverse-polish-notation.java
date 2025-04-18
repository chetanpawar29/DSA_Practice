class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens)
        {
            if(isOperator(token))
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(performOperation(token,a,b));
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }

    public boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public static int performOperation(String operator,int a, int b){
    
        switch(operator){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; 
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}