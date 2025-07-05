package apna_java.array_part1_16.Me;

public class binary {

    public static int b(int[] num, int key) {
        int s = 0;
        int e = num.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (num[m] == key) {
                return m;
            }
            if (num[m] < key) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 3;
        int a = b(num, key);

        System.out.println("your key value is " + num[a]);

    }
}
