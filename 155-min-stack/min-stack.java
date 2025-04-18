class MinStack {

    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.empty()){
            stack.push(new Pair(val,val));
        }else{
            stack.push(new Pair(val,Math.min(val,stack.peek().y)));
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().x;
    }
    
    public int getMin() {
        return stack.peek().y;
    }
}

class Pair{
    int x;
    int y;

    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */