// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addatlast(10);
        ll.addatlast(20);
        ll.addatlast(40);
        ll.display();
        ll.atfirst(50);
        ll.atfirst(60);
        ll.display();
        ll.atposition(2,30);
        ll.display();
        ll.delatfirst();
        ll.display();
        ll.delatlast();
        ll.display();
        ll.delatposition(2);
        ll.display();
    }
}
class Node{
    int data;
    Node next;

Node(int x){
    data=x;
    next=null;
}
}
    class LinkedList{
       Node head=null;
       void addatlast(int x){
           Node n=new Node(x);
           if(head==null){
               head=n;
               return;
           }
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=n;
       }
       void atfirst(int x){
           Node n=new Node(x);
           n.next=head;
           head=n;
       }
       void atposition(int p,int x){
           Node n=new Node(x);
           if(p==1){
               n.next=head;
               head=n;
           }
           int count=0;
           Node temp=head;
           while(temp!=null&& count<p-1){
               temp=temp.next;
               count++;
           }
           n.next=temp.next;
           temp.next=n;
       }
       void delatfirst(){
           if(head==null){
               System.out.println("LinkedList is Empty");
               return;
           }
           head=head.next;
       }
       void delatlast(){
           if(head==null){
               System.out.println("LinkedList is Empty");
               return;
           }
           if(head.next==null){
               head=null;
               return;
           }
           Node temp=head;
           while(temp.next.next!=null){
               temp=temp.next;
           }
           temp.next=null;
       }
       void delatposition(int p){
           if(head==null){
               System.out.println("LinkedList is Empty");
               return;
           }
           if(p==1){
               head=head.next;
           }
           int count=0;
           Node temp=head;
           while(temp!=null&&count<p-1){
               temp=temp.next;
               count++;
           }
           if(temp==null||temp.next==null){
               System.out.println("out of index");
               return;
           }
           temp.next=temp.next.next;
       }
       void display(){
               if(head==null){
               System.out.println("LinkedList is Empty");
                return;
           }
           Node temp=head;
           int count=0;
           System.out.println("linked list node");
           while(temp!=null){
               System.out.println(temp.data);
               temp=temp.next;
               count++;
           }
    }
}
