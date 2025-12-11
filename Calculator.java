import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);

        double result = 0;

        if(op == '+') {
            result = num1 + num2;
        } else if(op == '-') {
            result = num1 - num2;
        } else if(op == '*') {
            result = num1 * num2;
        } else if(op == '/') {
            if(num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid operation!");
            sc.close();
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}