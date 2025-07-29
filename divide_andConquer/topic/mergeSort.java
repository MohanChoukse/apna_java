package apna_java.divide_andConquer.topic;

public class mergeSort {

    public static void mergeSorted(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // or= (si + ei)/2;
        mergeSorted(arr, si, mid); // left side
        mergeSorted(arr, mid + 1, ei); // right side

        merge(arr, si, ei, mid);
    }

    // merge method to merge sorted parts
    public static void merge(int arr[], int si, int ei, int mid) {
        // left (0, 3)=4 right (4,6)=3 -> 6-0+1
        int temp[] = new int[ei - si + 1];
        int i = si; // idx for 1st sorted part
        int j = mid + 1; // idx for 2nd sorted part
        int k = 0; // idx for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover element of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for rightover element of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void printMerge(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSorted(arr, 0, arr.length - 1);
        printMerge(arr);
    }
}
