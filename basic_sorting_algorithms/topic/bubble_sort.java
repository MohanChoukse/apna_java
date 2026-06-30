package apna_java.basic_sorting_algorithms.topic;

public class bubble_sort {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        bubbleSort(arr);
        printArray(arr);
    }
}
