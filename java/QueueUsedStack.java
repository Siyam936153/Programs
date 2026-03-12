class MyQueue {
    Stack <Integer> s=new Stack<>();
    Stack <Integer> st=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!s.isEmpty()){
            st.push(s.pop());
        }
        s.push(x);
        while(!st.isEmpty()){
            s.push(st.pop());
      }
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
        
    }
    
    public boolean empty() {
    return s.isEmpty();
        
    }
}
