public class Queue_Linkedlist {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head = null;
    Node tail = null;
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    public void enque1(int data){
        Node newNode = new Node(data);
        if(tail == null){
           tail = head = newNode;
        }
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }
    public void deque1(){
        if (head == null){
            System.out.println("Empty");
        }
        else if (head == tail){
            head = null;
        }
        else{
            head = head.next;
        }
    }
    public void peek1(){
        if(head == null)
            System.out.println("Empty queue");
        else {
                System.out.println(head.data);
            }
        }

    public static void main(String[] args) {
        Queue_Linkedlist obj1 = new Queue_Linkedlist();
        obj1.enque1(1);
        obj1.enque1(2);
        obj1.enque1(3);
        obj1.enque1(4);
        while (obj1.head != null){
            obj1.peek1();
            obj1.deque1();
        }
    }
}

