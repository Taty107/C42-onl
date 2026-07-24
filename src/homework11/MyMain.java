package homework11;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please input three different string:");
        String firstString = getInput.nextLine();
        String secondString = getInput.nextLine();
        String thirdString = getInput.nextLine();

        StringHandler stringHandler = new StringHandler(firstString, secondString, thirdString);
        System.out.println("~".repeat(100));
        System.out.println("Task 1");
        System.out.println("The longest string is... " + stringHandler.getLongestString());
        System.out.println("The shortest string is... " + stringHandler.getShortestString());
        System.out.println("~".repeat(100));
        System.out.println("Task 2");
        System.out.println("Sorted strings: ");
        String[] sortedStrings = stringHandler.getSortedByLength();
        for (String string : sortedStrings) {
            System.out.println(string);
        }
        System.out.println("~".repeat(100));
        System.out.println("Task 3");
        stringHandler.getMediumLengthString();
        stringHandler.getShortestStringsThenMediumStringLength();
        System.out.println("~".repeat(100));
        System.out.println("Task 4");
        stringHandler.getStringWithUniqueCharacters();
        System.out.println("~".repeat(100));
        System.out.println("Task 5");
        stringHandler.duplicateEachCharacters(firstString);
        System.out.println("~".repeat(100));
        System.out.println("Task*");
        stringHandler.getPalindrome(firstString);

    }
}
