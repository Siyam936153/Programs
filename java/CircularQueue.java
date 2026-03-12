class MyCircularQueue {
    int front,rear,size,capacity;
    int arr[];

    public MyCircularQueue(int k) {
        capacity=k;
        front=-1;
        rear=-1;
        size=0;
        arr=new int[capacity];
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }if(isEmpty()){
            front=0;
            rear=0;
            arr[rear]=value;
        }else{
            rear=(rear+1)%capacity;
            arr[rear]=value;
        }
        size++;
        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(front==rear){
            front=-1;
            rear=-1;
            size=0;
            return true;
        }
        front=(front+1)%capacity;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty())
        return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        return arr[rear];
        
    }
    
    public boolean isEmpty() {
        return (front==-1);
        
    }
    
    public boolean isFull() {
        return (size==capacity);
        
    }
}
