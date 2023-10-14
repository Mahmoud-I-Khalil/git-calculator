import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            String[] tokens = input.split(" ");
            String command = tokens[0];
            Calculator calculator = new Calculator();

            switch (command) {
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(tokens[1])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(tokens[1])));
                    break;
                default:
                    System.out.println("Invalid command! Exiting....");
                    exit = true;
            }
        }
    }
}
