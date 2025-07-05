package apna_java.array_part2_17.assignment;

public class q1 {
    public static boolean containsDuplicat(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};// O(n^2)
        System.out.println(containsDuplicat(num));
    }
}
