public class BubbleSort_String {

    String str = "The quick brown fox jumps over the lazy dog";
    String[] arr = str.split(" ");

    public void sort() {

        for (int i = 0; i < str.length()-1; i++) {
            for (int j = 0; j < str.length()-1-i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else if (arr[j].length() == arr[j + 1].length()) {
                    for (int k = 0; k < arr[j].length(); k++) {
                        if (arr[j].charAt(k) > arr[j + 1].charAt(k)) {
                            String temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
            }
        }

        String str1 = String.join(" ", arr);
        System.out.println(str1);
    }
    public static void main(String[] args) {
        BubbleSort_String obj = new BubbleSort_String();
        obj.sort();
    }
}
