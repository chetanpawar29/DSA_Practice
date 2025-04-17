class MyQueue {

    Stack<Integer> st1;
     Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        
        while(st1.empty()==false)
        {
            st2.push(st1.peek());
            st1.pop();
        }

        st1.push(x);

        while(st2.empty()==false)
        {
            st1.push(st2.peek());
            st2.pop();
        }

    }
    
    public int pop() {

        int val = st1.peek();
        st1.pop();
        return val;
        
    }
    
    public int peek() {

        return st1.peek();
        
    }
    
    public boolean empty() {
        return st1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */