package homework11;

import java.util.Arrays;
import java.util.Scanner;

public class StringHandler {
    private final String[] strings;

    public StringHandler(String firstString, String secondString, String thirdString) {
        this.strings = new String[]{firstString, secondString, thirdString};
    }

    public String getLongestString() {
        String longest = strings[0];
        for (String string : strings) {
            if (string.length() > longest.length()) {
                longest = string;
            }
        }
        return longest;
    }

    public String getShortestString() {
        String shortest = strings[0];
        for (String string : strings) {
            if (string.length() < shortest.length()) {
                shortest = string;
            }
        }
        return shortest;
    }

    public String[] getSortedByLength() {
        String[] sorted = Arrays.copyOf(strings, strings.length);

        for (int i = 0; i < sorted.length; i++) {
            for (int x = 0; x < sorted.length - 1 - i; x++) {
                if (sorted[x].length() > sorted[x + 1].length()) {
                    String temp = sorted[x];
                    sorted[x] = sorted[x + 1];
                    sorted[x + 1] = temp;
                }
            }
        }
        return sorted;
    }

    public double getMediumLengthString() {
        double sumLengths = 0;

        for (String string : strings) {
            sumLengths += string.length();
        }
        return sumLengths / strings.length;
    }

    public void getShortestStringsThenMediumStringLength() {
        System.out.printf("Average string length %.2f%n", getMediumLengthString());
        System.out.println("Strings shortest average string:");
        for (String string : strings) {
            if (string.length() < getMediumLengthString()) {
                System.out.println(string + " his length is " + string.length());
            }
        }
    }

    public void getStringWithUniqueCharacters() {
        for (String word : strings) {
            if (isUnique(word)) {
                System.out.println("Word with unique letters: " + word);
                break;
            }
            if (!isUnique(word)) {
                System.out.println("Word with unique letters not found.");
                break;
            }
        }
    }

    public void duplicateEachCharacters(String string) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < string.length(); index++) {
            char c = string.charAt(index);
            result.append(c).append(c);
        }
        System.out.println(result.toString());
    }

    public boolean isUnique(String word) {
        for (int index = 0; index < word.length(); index++) {
            char c = word.charAt(index);
            if (word.indexOf(c) != word.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String word) {
        String lower = word.toLowerCase();
        String reversed = new StringBuilder(word).reverse().toString();
        return lower.equals(reversed);
    }

    public void getPalindrome(String string) {
        String[] words = string.split(" ");
        int numWord;
        System.out.println("Accessible words:");
        for (String word : words) {
            System.out.println(word);
        }
        do {
            System.out.print("Pleas enter the number of the word you want to check for a palindrome: ");
            Scanner getInput = new Scanner(System.in);
            numWord = getInput.nextInt();
            int index = numWord - 1;
            if (index >= 0 && index < words.length) {
                String selectedWord = words[index];
                System.out.println("You chose word " + selectedWord);

                if (isPalindrome(selectedWord)) {
                    System.out.println("Word " + selectedWord + " is PALINDROME!");
                } else {
                    System.out.println("Word " + selectedWord + " is not PALINDROME!");
                }
                break;
            } else {
                System.out.println("ERROR!! There is no word with that number!");
            }
        } while (true);
    }

    public String[] getStrings() {
        return strings;
    }
}
