public class Selection_sort {
    public void sort(int []arr){
        for (int i =0; i< arr.length-1; i++){
            int index =i;

            for (int j =i+1; j< arr.length; j++){
                if (arr[j] <arr[index]){
                    index =j;
                }
            }
            int small = arr[index];
            arr[index] = arr[i];
            arr[i] = small;
        }
    }
    public void display(int []arr){
        for (int e:arr)
            System.out.print(e+" ");
    }

    public static void main(String[] args) {
        Selection_sort obj = new Selection_sort();
        int []arr = {9,14,3,2,43,11,58,22};

        obj.sort(arr);
        obj.display(arr);
    }
}
