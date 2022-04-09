import java.util.Scanner;

public class BubbleSort1 {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int []arr = new int[n];

    public void sort(){
        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();
        for(int i=0; i<n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] > arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i=0; i<n; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        BubbleSort1 obj = new BubbleSort1();
        obj.sort();
    }
}
