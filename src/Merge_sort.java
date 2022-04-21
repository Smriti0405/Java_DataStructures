public class Merge_sort {
    public void merge (int []arr, int beg, int mid, int end) {

        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[beg + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = beg;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int []arr, int beg, int end){
        if (beg <end){
            int mid = (beg+end)/ 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, beg, mid, end);
        }
    }

    public void print(int []arr){
        for (int e: arr)
            System.out.print(e+" ");
    }

    public static void main(String[] args) {
        int []arr = {11, 30, 24, 7, 31, 16, 39, 41};
        Merge_sort obj = new Merge_sort();
        obj.print(arr);
        System.out.println();
        obj.mergeSort(arr, 0, arr.length-1);
        obj.print(arr);
    }

}
