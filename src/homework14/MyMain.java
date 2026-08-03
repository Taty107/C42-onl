package homework14;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class MyMain {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println("Task 1");
        readAndWriteFile();
        System.out.println("~".repeat(60));
    }

    public static void readAndWriteFile() {
        File file = new File("src/Romeo_and_Juliet.txt");
        File file1 = new File("src/output.txt");
        String longestWord = "";
        System.out.println("Let`s find the longest word in the passage from Romeo and Juliet...");
        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter("\\P{L}+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Excellent!! Is the longest word: " + RED + longestWord + RESET);
        } catch (IOException e) {
            System.out.println("File not found! " + e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"))) {
            writer.write("The longest word is: " + longestWord.toUpperCase(Locale.ROOT));
            writer.newLine();
            System.out.println("Writing the word to a new file has been completed!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
