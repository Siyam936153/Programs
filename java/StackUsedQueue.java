class MyStack {
    Queue<Integer> q1=new LinkedList<>();
     Queue<Integer> q2=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        
    }
    
    public int pop() {
       return q1.poll();
        
    }
    
    public int top() {
       return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
