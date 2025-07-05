package apna_java.basic_sorting_algorithms.topic;

import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        Integer brr[] = { 5, 4, 3, 2, 1 };
        int crr[] = { 5, 4, 3, 2, 1 };
        Arrays.sort(arr);
        Arrays.sort(brr, Collections.reverseOrder());
        Arrays.sort(crr, 0, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(crr[i] + " ");
        }
        System.out.println();
    }
}
