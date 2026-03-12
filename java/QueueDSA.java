// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Queue {
    int front, rear, size, capacity;
    int arr[];

    Queue(int c) {
        capacity = c;
        front = -1;
        size = 0;
        rear = -1; 
        arr = new int[capacity];
    }
    void enqueue(int x){
        if(rear==capacity-1){
           System.out.println("queue is full"); 
        }
        if(front==-1)
            front=0;
            rear++;
            arr[rear]=x;
            size++;
        
    }
        void dequeue(){
            if(front==-1){
                System.out.println("Queue is empty");
            }
            if(front==rear){
                front=-1;
                rear=-1;
            }
            int x=arr[front];
            System.out.println(arr[front]+ " is the removed element");
            front++;
            size--;
        }
        void top(){
            if(front==-1){
                System.out.println("Empty");
                return;
            }
            System.out.println("peek element: "+arr[front]);
        }
        void getIndex(int value) {
    if (front == -1) {
        System.out.println("Queue is empty");
        return;
    }

    for (int i=front;i<=rear;i++) {
        if (arr[i]==value) {
        System.out.println("The index of value "+value+" is: "+i);
            return;
        }
    }
}
void index(int i){
    if(front==-1){
        System.out.println("Queue is Empty");
        return;
    }
    if(i>=front&&i<capacity){
        System.out.println("the value of index "+i+" is "+arr[i]);
    }
}

        void display(){
            if(front==-1){
                System.out.println("empty");
            }
            System.out.println("queue element");
            for(int i=front;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
}
class Main {
    public static void main(String[] args) {
       Queue q=new Queue(5);
       q.enqueue(10);
       q.enqueue(20);
       q.enqueue(30);
       q.enqueue(40);
       q.enqueue(50);
       q.display();
       q.dequeue();
       q.dequeue();
       q.display();
       q.top();
       q.getIndex(40);
       q.index(3);
       
    }
}
