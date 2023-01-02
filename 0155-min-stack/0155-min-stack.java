class MinStack {
    Stack <Integer> n  = new Stack<>();
    Stack <Integer> m  = new Stack<>();

    public MinStack() {

        
    }
    
    public void push(int val) {
     n.push(val);
        if(m.empty()){
            m.push(val);
        }else if(val<=m.peek()){
            m.push(val);
        }
        
    }
    
    public void pop() {
    if(n.empty()){
            return ;
        }
        int  val = n.pop();
        if(!m.empty()){
            if(m.peek()==val){
                m.pop();
            }
        } 
    }
    
    public int top() {
     if(n.empty()){
            return -1;
        } 
        return n.peek();
    }
    
    public int getMin() {
     if(m.empty()){
            return -1;
        }
        return m.peek();
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

