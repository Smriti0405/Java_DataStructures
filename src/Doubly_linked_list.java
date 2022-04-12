public class Doubly_linked_list {
    Node head;
    Node prevNode;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFront(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            newNode.prev = null;
        }
        else{
            head.prev = newNode;
        }
    }

    public void addBefore(Node currNode, int data){
        Node newNode = new Node(data);
        if (currNode == null)
            System.out.println("Cannot be null");
        else{
            newNode.prev = currNode.prev;
            currNode.prev = newNode;
            newNode.next = currNode;
        }
        if (newNode.prev != null){
            newNode.prev.next = newNode;
        }
        else
            head = newNode;

    }

    public void addAfter(Node prevNode, int data){
        Node newNode = new Node(data);
       if (prevNode== null){
           System.out.println("It cannot be empty");
       }
        else{
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            newNode.prev = prevNode;
       }
        if (newNode.next != null){
            newNode.next.prev = newNode;
        }
    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("Empty list");
        }
        else{
            if (head.next == null)
                head = null;
            else{
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void deleteLast(){
        if (head == null){
            System.out.println("Empty list");
        }
        else{
            Node seclast = head;
            Node last = head.next;
            while (last.next != null){
                last = last.next;
                seclast = seclast.next;
            }
            seclast.next = null;

        }
    }

    public void traverse(){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Doubly_linked_list obj = new Doubly_linked_list();
        obj.addFront(2);
        obj.addBefore(obj.head, 1);
        obj.addAfter(obj.head.next, 3);
        obj.addAfter(obj.head.next.next, 4);
        obj.traverse();
        obj.deleteFirst();
        obj.deleteLast();
        obj.traverse();
    }
}
