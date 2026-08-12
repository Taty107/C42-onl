package homework_binary_calculator;

import java.util.Scanner;

public class BinaryCalculator {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CYAN + "~".repeat(70));
        System.out.println("\t\t\tConsole-based binary conversion calculator");
        System.out.println("~".repeat(70) + RESET);

        boolean running = true;
        while (running) {
            int methodChoice = getMethodChoice(scanner);
            int number = getDecimalNumber(scanner);

        }
    }

    private static int getMethodChoice(Scanner scanner) {
        while (true) {
            System.out.println("Choose the method for converting the number");
            System.out.println("1 - using an array");
            System.out.println("2 - using recursion");
            System.out.print("Enter the option number: ");
            String inputChoice = scanner.nextLine().trim();
            if (inputChoice.equals("1") || inputChoice.equals("2")) {
                return Integer.parseInt(inputChoice);
            }
            System.out.println(RED + "Error!! An incorrect value has been entered. Please enter 1 or 2." + RESET);
        }
    }

    private static int getDecimalNumber(Scanner scanner) {
        while (true) {
            System.out.print("Please enter a decimal number: ");
            String inputNumber = scanner.nextLine().trim();
            try {
                int number = Integer.parseInt(inputNumber);
                if (number < 0) {
                    System.out.println(RED + "Error!! Please enter a non‑negative integer." + RESET);
                    continue;
                }
                return number;
            } catch (NumberFormatException e){
                System.out.println(RED + "Error!! A non‑integer value or an invalid character has been entered." +
                        "\nPlease re‑enter the value." + RESET);
            }
        }
    }

    private static String convertUsingArray(int number, String[] processSteps, int[] stepCount){
        if (number == 0) {
            processSteps[0] = "0 / 2 = 0, remainder 0";
            stepCount[0] = 1;
            return "0";
        }
    }
}
