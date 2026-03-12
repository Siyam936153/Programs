class Stack{
    int arr[]=new int[5];
    int top=-1;
    int size=0;
    void push(int x){
        if(isfull()){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top]=x;
        size++;
    }
    boolean isfull(){
        return top==arr.length-1;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("stack is underflow");
            return;
        }
        int a=arr[top];
        top--;
        size--;
        System.out.println("removed elements are:"+a);
    }
    boolean isEmpty(){
        return top==-1;
    }
    void peek(){
        if(isEmpty()){
            System.out.println("stack is underflow");
        }
        System.out.println("the peek element is :"+arr[top]);
    }
    void size(){
        System.out.println(size);
    }
    void getIndex(int v){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            if(arr[i]==v){
                System.out.println("the index of this "+v+" value is "+i);
            }
        }
        
    }
    boolean contains(int c) {
    for(int i=top;i>=0;i--){
        if (arr[i] == c) {
        return true ;
        }
    }
    return false;
}
void index(int value){
    if(isEmpty()){
    System.out.println("stack is empty");
            return; 
    }
        if(value>=0&&value<arr.length){
            System.out.println("the value of :" +arr[value]);
        }
}
    void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack element");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
public String toString(){
    if(isEmpty()){
      return "stack is empty";
    }
    StringBuilder sb=new StringBuilder();
    sb.append('[');
    for(int i=top;i>=0;i--){
        sb.append(arr[i]);
        if(i!=0){
            sb.append(',');
        }
    }
    sb.append(']');
    return sb.toString();
}
}
class Main {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.pop();
        s.display();
        s.peek();
        s.getIndex(30);
        System.out.println(s.contains(40));
        s.index(2);
        s.size();
        System.out.println(s);
    }
}
