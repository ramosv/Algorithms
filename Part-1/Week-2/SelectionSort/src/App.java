public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int indexOfSmallest(int arr[], int indexFrom) {
        int temp = 999999;
        int index = 0;

        for (int i = indexFrom; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, indexOfSmallest(arr, i));
        }
    }
}
