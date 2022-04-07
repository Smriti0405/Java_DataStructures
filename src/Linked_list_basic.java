public class Linked_list_basic {
    Node head;
    Node currNode;
    int size = 0;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // add ele at first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    // add ele at last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        size++;
    }
    // delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("Empty list");
        }
        else {
            head = head.next;
        }
    }
    //del last ele
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
        size--;
    }
    // printing size
    public void getSize(){
        System.out.println(size);
    }
    // printing list
    public void printList() {
        if (head == null)
            System.out.println("Empty list");
        else {
            currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
        }
    }



    public static void main(String[] args) {
        Linked_list_basic obj = new Linked_list_basic();
        obj.addFirst("1");
        obj.addLast("2");
        obj.addLast("3");
        obj.printList();
        obj.deleteFirst();
        obj.printList();
        obj.deleteLast();
        obj.printList();
        obj.getSize();
    }
}
