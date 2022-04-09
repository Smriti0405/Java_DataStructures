import java.util.Scanner;

public class Stack_array {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int[n];
    int top;
    int data;

    Stack_array(){
        top = -1;
    }

    public boolean isFull(){
        if (top == n-1)
            return true;
        else
            return false;
    }

    public void push(int data){
        if(isFull()) {
            System.out.println("overflow");
        }
        else{
            top++;
            arr[top] = data;
        }
    }

    public void pop(){
        if (top == -1)
            System.out.println("underflow");

        else {
            System.out.println("Deleted: " + arr[top]);
            top--;
        }
    }

    public void traverse(){
        for (int i=top; i>= 0; i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_array obj = new Stack_array();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.traverse();
        obj.pop();
        obj.traverse();

    }
}
