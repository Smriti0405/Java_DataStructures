import java.util.ArrayList;

public class Stack_ArrayList {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public boolean isEmpty() {
        return (list.size() == 0);
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public int peek() {
        if (isEmpty())
            System.out.println("underflow");
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        Stack_ArrayList obj = new Stack_ArrayList();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}
