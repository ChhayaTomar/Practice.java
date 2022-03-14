package DSA2;

import java.util.LinkedList;

public class PracticeLL {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    int size=0;

    public void insertAtLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head= newNode;
            head.next=null;
            size++;
        }else{
            Node i=this.head;
            while(i.next!=null){
                i=i.next;
            }
            i.next=newNode;
            size++;
        }
    }

    public void insertAtStart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=null;
            size++;
        }else{
            Node i=this.head;
            newNode.next=head;
            head=newNode;
            size++;
        }
    }

    public void insertAtIndex(int data,int k) {
        Node newNode = new Node(data);
        if(head==null && k!=0){
            return;
        }else if(head==null && k==0){
            this.head=newNode;
            size++;
        }else{
            Node curr=this.head;
            Node prev=null;

            int i=0;

            while(i<k){
                prev=curr;
                curr=curr.next;
                if(curr==null) break;
                i++;
            }
            newNode.next=curr;
            prev.next=newNode;
            size++;

        }
    }

    public void removeFromLast(){
        if(head==null) System.out.println("List is already empty !!");
        else if(head.next==null){
            head=null;
            size--;
        }else{
            Node i=this.head;
            while(i.next.next!=null){
                i=i.next;
            }
            i.next=null;
            size--;
        }
    }

    public void removeFromStart(){
        if(head==null) System.out.println("List is already empty !!");
        else if(head.next==null){
            head=null;
            size--;
        }else{
            Node i=this.head;
            head=head.next;
            size--;
        }
    }

    public void display(){
        Node i=head;
        if(head==null){
            System.out.println("List is Empty !!");
        }else{
            while(i!=null){
                System.out.print(i.data + " -> ");
                i=i.next;
            }
            System.out.println("Null");
        }
    }
    public static void main(String[] args) {
        PracticeLL list=new PracticeLL();
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.display();
        System.out.println(list.size);
//        list.insertAtStart(0);
//        list.display();
//        System.out.println(list.size);
//        list.removeFromLast();
//        list.display();
//        System.out.println(list.size);
//        list.removeFromStart();
//        list.display();
//        System.out.println(list.size);
        list.insertAtIndex(6,6);
        list.display();
        System.out.println(list.size);

    }
}
