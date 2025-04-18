class MyQueue {

    Stack<Integer> st1;
     Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        
        st1.push(x);
    }
    
    public int pop() {

        if(st2.empty())
        {
            while(st1.empty() == false)
            {
                st2.push(st1.peek());
                st1.pop();
            }
        }

        int val = st2.peek();
        st2.pop();

        return val;
        
    }
    
    public int peek() {
        if(st2.empty())
        {
            while(st1.empty() == false)
            {
                st2.push(st1.peek());
                st1.pop();
            }
        }
       
       return st2.peek();
    }
    
    public boolean empty() {
        return st2.empty() && st1.empty();
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