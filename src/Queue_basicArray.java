import java.util.Scanner;

public class Queue_basicArray {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int []arr = new int[n];
    int front;
    int rear;
    Queue_basicArray(){
        front = -1;
        rear = -1;
    }
    public void enque(int data){
        if (rear == n-1){
            System.out.println("overflow queue");
        }
        else {
            rear++;
            arr[rear] = data;
            front = 0;
        }
    }
    public void deque(){
        if (front == -1){
            System.out.println("Empty queue");
        }
        else{

            for(int i =0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
       }
    }
    public void taverse(){
        if (front ==-1)
            System.out.println("underflow");
        else {
            for(int i=0; i< rear+1; i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Queue_basicArray obj = new Queue_basicArray();
        obj.enque(1);
        obj.enque(2);
        obj.enque(3);
        obj.enque(4);
        obj.taverse();
        obj.deque();
        obj.taverse();
    }
}

