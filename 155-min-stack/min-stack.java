class MinStack {

    Stack<Long> stack;
    Long min;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int value) {
        Long val = Long.valueOf(value);
        if(stack.empty()){
            min = val;
            stack.push(val);
        }else{
            if(val > min){
                stack.push(val);
            }else{
                stack.push(2*val - min);
                min = val;
            }
        }
    }
    
    public void pop() {
        Long x = stack.peek();
        stack.pop();
        if(x < min){
            min = 2*min - x;
        }
    }
    
    public int top() {
        Long x = stack.peek();

        if(x < min){
            return min.intValue();
        }else{
            return x.intValue();
        }
    }
    
    public int getMin() {
        return min.intValue();
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