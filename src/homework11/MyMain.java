package homework11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please input three different string:");
        String firstString = getInput.nextLine();
        String secondString = getInput.nextLine();
        String thirdString = getInput.nextLine();
    }

    public static void getLongestAndShortestString(String firstString, String secondString, String thirdString){
        if (firstString.length() > secondString.length() && firstString.length() > thirdString.length()){
            System.out.println("This string is the longest: "
                    + "\n" + firstString + "\nIts length " + firstString.length());
        } else if (secondString.length() > firstString.length() && secondString.length() > thirdString.length()) {
            System.out.println("This string is the longest: "
                    + "\n" + secondString + "\nIts length " + secondString.length());
        } else if (thirdString.length() > firstString.length() && thirdString.length() > secondString.length()) {
            System.out.println("This string is the longest: "
                    + "\n" + thirdString + "\nIts length " + thirdString.length());
        } else {
            System.out.println("All string have the same length.");
        }

        if (firstString.length() < secondString.length() && firstString.length() < thirdString.length()){
            System.out.println("This string is the shortest: "
                    + "\n" + firstString + "\nIts length " + firstString.length());
        } else if (secondString.length() < firstString.length() && secondString.length() < thirdString.length()) {
            System.out.println("This string is the shortest: "
                    + "\n" + secondString + "\nIts length " + secondString.length());
        } else if (thirdString.length() < firstString.length() && thirdString.length() < secondString.length()) {
            System.out.println("This string is the shortest: "
                    + "\n" + thirdString + "\nIts length " + thirdString.length());
        }
    }

    public static void regularizeString(String firstString, String secondString, String thirdString){
        String[] strings = {firstString, secondString, thirdString};
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println("These are your strings in ascending order:");
        for (String st : strings){
            System.out.println(st);
        }
    }
}
