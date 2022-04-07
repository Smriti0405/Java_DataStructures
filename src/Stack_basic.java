public class Stack_basic {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public void push(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("underflow");
        }
        else{
            int top = head.data;
            head = head.next;
        }
    }
    public void peek(){
        if (isEmpty())
            System.out.println("underflow");
        else {
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        Stack_basic obj = new Stack_basic();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        while (!obj.isEmpty()){
            obj.peek();
            obj.pop();

        }


    }
}
