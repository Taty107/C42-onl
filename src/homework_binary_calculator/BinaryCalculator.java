package homework_binary_calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BinaryCalculator {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    private static String historyFile = "src/History_file.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CYAN + "~".repeat(70));
        System.out.println("\t\t\tConsole-based binary conversion calculator");
        System.out.println("~".repeat(70) + RESET);

        boolean running = true;
        while (running) {
            int methodChoice = getMethodChoice(scanner);
            int number = getDecimalNumber(scanner);
            String stepsText = "";
            String binaryResult = "";
            String methodName = "";

            if (methodChoice == 1) {
                methodName = "with using an array";
                String[] stepsArray = new String[32];
                int[] stepCount = new int[1];
                binaryResult = convertUsingArray(number, stepsArray, stepCount);

                for (int i = 0; i < stepCount[0]; i++) {
                    stepsText += stepsArray[i] + "\n";
                }
            } else if (methodChoice == 2){
                methodName = "with using recursion";

                if (number == 0) {
                    stepsText = "0 / 2 = 0, remainder 0\n";
                    binaryResult = "0";
                } else {
                    stepsText = getStepsRecursive(number);
                    binaryResult = convertRecursive(number);
                }
            }

            printConsoleResult(number, methodName, stepsText, binaryResult);

            saveResultToFile(number, methodChoice == 1 ? "array" : "recursive", binaryResult);

            running = askToContinue(scanner);

            System.out.println(CYAN + "~".repeat(70));
            System.out.println("\nAll results are saved in the file " + RESET + YELLOW + historyFile + RESET + CYAN + ".");
            System.out.println("The program has finished its operation." + RESET);
        }
    }

    private static int getMethodChoice(Scanner scanner) {
        while (true) {
            System.out.println("Choose the method for converting the number");
            System.out.println(PURPLE + "1 - using an array");
            System.out.println("2 - using recursion" + RESET);
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
        int[] remainders = new int[32];
        int count = 0;
        int temp = number;

        while (temp > 0) {
            int quotient = temp / 2;
            int remainder = temp % 2;

            processSteps[stepCount[0]] = temp + " / 2 = " + quotient + ", remainder " + remainder;
            stepCount[0]++;

            remainders[count] = remainder;
            count++;
            temp = quotient;
        }

        String binaryResult = "";
        for (int index = count - 1; index >= 0; index--) {
            binaryResult += remainders[index];
        }
        return binaryResult;
    }

    private static String convertRecursive(int number) {
        if (number == 0) {
            return "";
        }
        return convertRecursive(number / 2) + (number % 2);
    }

    private static String getStepsRecursive(int number) {
        if (number == 0) {
            return "";
        }
        int quotient = number / 2;
        int remainder = number % 2;
        String processSteps = number + " / 2 = " + quotient + ", remainder " + remainder + "\n";
        return processSteps + getStepsRecursive(quotient);
    }

    private static void printConsoleResult(int number, String methodName, String stepsText, String binaryResult) {
        System.out.println(CYAN + "~".repeat(70) + RESET);
        System.out.println("The original decimal number: " + number);
        System.out.println("Method of converting: " + methodName);
        System.out.println("Process converting: ");
        System.out.println(stepsText);
        System.out.println("Remains in reverse order: " + binaryResult);
        System.out.println("The binary value of a number " + number + ": " + binaryResult);
        System.out.println(CYAN +"~".repeat(70) + RESET);

    }

    private static void saveResultToFile(int number, String methodName, String binaryResult) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(historyFile, true))) {
            writer.newLine();
            writer.write("The original decimal number: " + number);
            writer.newLine();
            writer.write("Method of converting: " + methodName);
            writer.newLine();
            writer.write("Result: " + binaryResult);
            writer.newLine();
            writer.write("~".repeat(50));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean askToContinue(Scanner scanner) {
        while (true){
            System.out.println("Do you want to enter another decimal number?");
            System.out.println(PURPLE + "1 - yes");
            System.out.println("2 - no" + RESET);
            System.out.print("Please enter the option number: ");

            String input = scanner.nextLine();
            if (input.equals("1")) {
                return true;
            } else if (input.equals("2")){
                return false;
            }
            System.out.println(RED + "Error!! An incorrect value has been entered. Please enter 1 or 2." + RESET);
        }
    }
}
