
import java.util.Scanner;

class Calculator {

    public float add(float a, float b) {
        return a + b;
    }

    public float sub(float a, float b) {
        return a - b;
    }

    public float div(float a, float b) {
        return a / b;
    }

    public float mul(float a, float b) {
        return a * b;
    }
}

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("Enter Your First num: ");
            float a = sc.nextFloat();
            System.out.println("Enter Your Second num: ");
            float b = sc.nextFloat();

            System.out.println("Enter Your Operation (+, -, /, *): ");
            String op = sc.next();

            switch (op) {
                case "+":
                    System.out.println("Result: " + obj.add(a, b));
                    break;
                case "-":
                    System.out.println("Result: " + obj.sub(a, b));
                    break;
                case "/":
                    System.out.println("Result: " + obj.div(a, b));
                    break;
                case "*":
                    System.out.println("Result: " + obj.mul(a, b));
                    break;
                default:
                    System.out.println("Invalid Operation.");
                    break;
            }

            System.out.println("Do you want to perform another calculation? (Y/N)");
            String ch = sc.next();

            if (ch.equalsIgnoreCase("N")) {
                continueCalculation = false;
                System.out.println("Thank you for using this program.");
            }
        }

        sc.close();
    }
}
