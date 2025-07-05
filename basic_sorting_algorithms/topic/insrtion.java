package apna_java.basic_sorting_algorithms.topic;

public class insrtion {
    public static void insrtionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int crr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > crr) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev + 1] = crr;

        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insrtionSort(arr);
        printArray(arr);
    }
}
