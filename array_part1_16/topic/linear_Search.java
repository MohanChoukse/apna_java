package apna_java.array_part1_16.topic;

public class linear_Search {
    public static int linear(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};
        int key = 6;
        int index = linear(arr, key);
        if (index == -1) {
            System.out.println("Your value are not present");
        } else {
            System.out.println("Your valur is = " + index);
        }
    }
}
