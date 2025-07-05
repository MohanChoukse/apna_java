
package apna_java.patterns_part2_15.topic;

public class diamond_pattern {

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}





// This is my trail code for different 👆👆


// package apna_java.patterns_part2_15.topic;

// public class diamond_pattern {

//     public static void diamond(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i) - 1; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i) - 1; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i) - 1; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i) - 1; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//     }


//     public static void main(String[] args) {
//         diamond(4);
//     }
// }
