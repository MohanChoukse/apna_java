package apna_java.array_part1_16.topic;


public class largest_Element {

    public static int getLargest(int[] number) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
                System.out.println("This is your smallest value = " + smallest);
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] number = {1, 2, 5, 8, 5, 9, 10};
        int largest = getLargest(number);
        System.out.println("This is your largest value = " + largest);
    }
}
