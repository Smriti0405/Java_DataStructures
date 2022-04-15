import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplicate {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    int[] arr = new int[n];
    int val = sc.nextInt();
    int temp = 0;

    public void remove() {
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        for(int i= 0; i<n; i++){
            if(nums[i] == val)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        for (int i=0; i< n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (arr[j-1] > arr[j]){
                    temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int e: nums) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Remove_duplicate obj = new Remove_duplicate();
        obj.remove();
    }
}