import java.util.Scanner;

public class Insertion_sort {
     public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int count = 0;
     int temp = num;

          while (temp > 0) {
               temp= temp / 10;
               count++;
          }

     int []arr = new int[count];
          int i = 0;
          while (num > 0) {
               arr[i] = num % 10;
               num = num / 10;
               i++;
          }

          for (int k = 1; k < count; k++) {
               int var = arr[k];
               int j = k;
               while (j > 0 && arr[j - 1] > var) {
                    arr[j] = arr[j - 1];
                    j--;
               }
               arr[j] = var;
          }
          for (int k = 0; k < count; k++) {
               System.out.println(arr[k]);
          }
    // }

     }
}
