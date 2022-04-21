public class Quick_sort {

        public int partition(int []arr, int start, int end){
                int pivot = arr[end];
                int i = start-1;

                for (int j = start; j<= end-1; j++){
                        if (arr[j] <pivot){
                                i++;
                                int t = arr[i];
                                arr[i] =arr[j];
                                arr[j] = t;
                        }
                }
                int t = arr[i+1];
                arr[i+1] = arr[end];
                arr[end] = t;

                return i+1;
        }
        public void quick(int arr[], int start, int end){
                if (start <end){
                        int p =partition(arr, start, end);
                        quick(arr, start, p-1);
                        quick(arr, p+1, end);
                }
        }
        public void print(int []arr){
                for (int i =0; i< arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
        }

        public static void main(String[] args) {
                int arr[] = { 13, 18, 27, 2, 19, 25 };
                Quick_sort obj = new Quick_sort();
                obj.print(arr);
                System.out.println();
                obj.quick(arr, 0, arr.length-1);
                obj.print(arr);
        }
}
