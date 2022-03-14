package DSA2;

public class LL {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size = 0;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        } else {
            Node i = this.head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = newNode;
            size++;
        }
    }

    public void display() {
        Node i = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (i != null) {
                System.out.print(i.data + " -> ");
                i = i.next;
            }
        }
        System.out.println("Null");
    }

    public void removeFromLast() {
        if (head == null) return;
        else if (head.next == null) {
            // Node i=this.head;
            this.head = null;
            size--;
            return;
        } else {
            //here i is secondlast node
            Node i = this.head;
            while (i.next.next != null) {
                i = i.next;
            }
            i.next = null;
            size--;
        }

    }

    public void removeFromFirst() {
        if (head == null) return;
        else if (head.next == null) {
            this.head = null;
            size--;
            return;
        } else {
            this.head = head.next;
            size--;
        }
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(2);
        list.insertAtLast(3);
        list.insertAtFirst(1);
        list.display();
        System.out.println(list.size);
        list.removeFromLast();
        list.display();
        System.out.println(list.size);
        list.removeFromFirst();
        list.display();
        System.out.println(list.size);
    }
}
