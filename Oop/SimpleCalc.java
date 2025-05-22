// practice problem 1.2



import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scan.next().charAt(0);

        int result = 0;
        boolean valid = true;

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Cannot divide by zero");
                valid = false;
            }
        } else {
            System.out.println("Invalid operator");
            valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}





