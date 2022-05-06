import java.util.Arrays;

public class BinarySearch {

    public void search(int []arr, int first, int last, int key){
        Arrays.sort(arr);
        int mid = (first + last)/2;
        while (first<= last){

            if(key <arr[mid])
                last = mid-1;

            else if (key == arr[mid]) {
                System.out.println(mid);
                break;
            }

            else
                first = mid+1;

            mid = (first+last)/2;
        }
        if (first >last)
            System.out.println("Element not found");
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int []arr = {10, 40, 35, 20, 70, 55, 60};
        obj.search(arr, 0, arr.length-1, 35);
    }
}
