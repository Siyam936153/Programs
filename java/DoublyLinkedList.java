class Node{ 
    int data; 
    Node next; 
    Node prev; 
    Node(int x){ 
        data=x; 
        next=null; 
        prev=null; 
    }
    }
class LinkedList {
    Node head = null;
    Node tail = null;
   int size=0;
    void addatfirst(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            tail = n;
            size++;
            return;
        }
        n.next = head;
        head.prev = n;
        head = n;
        size++;
    }

    void addatlast(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            tail = n;
            size++;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
        size++;
    }
    void addatindex(int p,int x){
        if(p<0||p>size){
            System.out.println("Invalid");
            return;
        }
        if(p==1){
            addatfirst(x);
            return;
        }
        if(p==size){
            addatlast(x);
            return;
        }
        Node n=new Node(x);
        if (head == null) {
            head = n;
            tail = n;
            return;
        }
        int count=1;
        Node temp=head;
        while(count<p-1){
            temp=temp.next;
            count++;
        }   
        n.next=temp.next;
        n.prev=temp;
        temp.next.prev=n;
        temp.next=n;
        size++;
    }
    void delatfirst() {
    if (head == null) {
        System.out.println("Empty");
        return;
    }
    if (head.next == null) {
        head = null;
        tail = null;
        size--;
        return;
    }
    head = head.next;
    head.prev = null;
    size--;
}
void delatlast() {
    if (head == null) {
        System.out.println("Empty");
        return;
    }
    if (head.next == null) {
        head = null;
        tail = null;
        size--;
        return;
    }
    tail=tail.prev;
    tail.next=null;
    size--;
}
void delatindex(int p){
    Node temp=head;
    if(p<=0||p>size){
        System.out.println("Invalid");
        return;
    }
    if(p==1){
        delatfirst();
        return;
    }
    if(p==size){
        delatlast();
        return;
    }
    int count=1;
    while(count<p){
        temp=temp.next;
        count++;
    }
    temp.prev.next=temp.next;
    temp.next.prev=temp.prev;
    size--;
}
    
 void display() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        System.out.println("Node");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void rdisplay() {
        if (tail == null) {
            System.out.println("Empty");
            return;
        }
        Node temp =tail;
        System.out.println("reverse node");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    }
class Main {
    public static void main(String[] args) {
       LinkedList ll=new LinkedList();
       ll.addatfirst(10); 
       ll.addatfirst(20); 
       ll.addatfirst(30);
       ll.addatlast(40);
       ll.addatlast(50);
       ll.addatindex(2,60);
       ll.delatfirst();
       ll.delatlast();
       ll.delatindex(2);
       ll.display();
       ll.rdisplay();
    }
}
