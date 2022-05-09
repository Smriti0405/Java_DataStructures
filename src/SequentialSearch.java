import java.util.Arrays;

public class SequentialSearch {

    public void search(int []arr, int key){
        Arrays.sort(arr);
        for (int i =0; i< arr.length; i++){
            if (arr[i] == key) {
                System.out.println(i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        SequentialSearch obj = new SequentialSearch();
        int []arr = {20, 30, 15, 70, 65, 60};
        obj.search(arr, 70);
    }
}
