package practice;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {

        // String str1 = "races";
        // String str2 = "cares";
        String str1 = "mohan";
        String str2 = "Chouksey";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean result = Arrays.equals(arr1, arr2);

            if (result) {
                System.out.println(" Your " + str1 + " and " + str2 + " is anagrams");
            } else {
                System.out.println(" Your " + str1 + " and " + str2 + " is not anagrams");

            }

        } else {
            System.out.println(" Your " + str1 + " and " + str2 + " is not anagrams");

        }

    }
}
