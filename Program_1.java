//this code is return in java language
import java.util.Scanner;

class Calculator {

    // Method to perform operation
    public double calculate(double a, double b, String op) {
        switch (op) {
            case "add":
            case "+":
                return a + b;

            case "sub":
            case "-":
                return a - b;

            case "mul":
            case "*":
                return a * b;

            case "div":
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero not allowed!");
                    return Double.NaN;
                }
                return a / b;

            default:
                System.out.println("Invalid operation type!");
                return Double.NaN;
        }
    }
}
class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div or + - * /): ");
        String op = sc.next();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, op);

        System.out.println("Result: " + result);
    }
}
