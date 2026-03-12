class MinStack {
    Stack <Integer> st=new Stack<>();
    Stack <Integer> minst=new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()||st.peek()<=minst.peek()){
            minst.push(val);
        }
        
    }
    
    public void pop() {
        int x=st.peek();
        st.pop();
        if(minst.peek()==x){
            minst.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minst.peek();
        
    }
}
