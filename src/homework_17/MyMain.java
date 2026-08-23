package homework_17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("~".repeat(70));
        System.out.println("Task 1");
        getDateOfHundredthBirthday();
        System.out.println("~".repeat(70));
        System.out.println("Task 2");
        getPositiveNumbers(new int[]{-1, 11, 22, -8, 0, 5, -3});
        System.out.println("~".repeat(70));
        System.out.println("Task 3");
        convertBynToUsdWithFunction();
        System.out.println("~".repeat(70));
        System.out.println("Task 4");
        convertBynToUsdWithConsumer();
        System.out.println("~".repeat(70));
        System.out.println("Task 5");
        Supplier<String> reversedString = getReversedString();
        String result = reversedString.get();
        System.out.println("Result: " + result);
        System.out.println("~".repeat(70));
    }

    public static void getDateOfHundredthBirthday() {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Please enter your date of birth (in format DD.MM.YYYY): ");
        String inputDate = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(inputDate, formatter);
        LocalDate date100 = birthDate.plusYears(100);
        System.out.println("You will turn 100 years old: " + date100.format(formatter));
    }

    public static void getPositiveNumbers(int[] numbers) {
        Predicate<Integer> isPositive = n -> n > 0;
        System.out.println("Positive numbers is: ");
        for (int number : numbers) {
            if (isPositive.test(number)) {
                System.out.println(number + " ");
            }
        }
    }

    public static void convertBynToUsdWithFunction() {
        double exchangeRate = 0.3359;

        Function<String, Double> convertByn = string -> {
            String numericPart = string.replace("BYN", "").trim();
            double amountInByn = Double.parseDouble(numericPart);
            return amountInByn * exchangeRate;
        };

        String input = "300 BYN";
        Double resultInUsd = convertByn.apply(input);
        System.out.printf("Original string: %s%n", input);
        System.out.printf("The amount in dollars: %.2f USD%n", resultInUsd);
    }

    public static void convertBynToUsdWithConsumer() {
        double exchangeRate = 0.3359;

        Consumer<String> convertByn = string -> {
            String numericPart = string.replace("BYN", "").trim();
            double amountInByn = Double.parseDouble(numericPart);
            double resultInUsd = amountInByn * exchangeRate;

            System.out.printf("Original string: %s -> %.2f USD%n", string, resultInUsd);
        };

        convertByn.accept("900 BYN");
    }

    public static Supplier<String> getReversedString() {
        Scanner scanner = new Scanner(System.in);

        return () -> {
            System.out.println("Please enter string:");
            String input = scanner.nextLine();
            return new StringBuilder(input).reverse().toString();
        };
    }
}
