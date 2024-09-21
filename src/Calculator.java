import java.util.Scanner;

public class Calculator {

    //    method to add two values
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice! Please choose a valid operation.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (num2 != 0) {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;
            }

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            scanner.nextLine();
            String nextCalc = scanner.nextLine();

            if (!nextCalc.equalsIgnoreCase("yes")) {
                break;
            }
        }
        scanner.close();
    }
}
