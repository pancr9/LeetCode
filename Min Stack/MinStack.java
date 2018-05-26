class MinStack {
    
    Stack<Integer> stack;
    Stack<Integer> stackOfMin;

    /** initialize your data structure here. */
    public MinStack() {
        
        stack = new Stack<Integer>();
        stackOfMin = new Stack<Integer>();
    }
    
    public void push(int x) {
        
        stack.push(x);
        if(stackOfMin.empty())
            stackOfMin.push(x);
        else if(stackOfMin.peek() >= x)
            stackOfMin.push(x);
    }
    
    public void pop() {
        
        if(stack.empty()) return;
        
        int x = stack.pop();
        if(x == stackOfMin.peek())
            stackOfMin.pop();
        
    }
    
    public int top() { 
        return !stack.empty() ? stack.peek() : 0;        
    }
    
    public int getMin() {
        return stackOfMin.empty() ? 0 : stackOfMin.peek();        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
