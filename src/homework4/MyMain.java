package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main(String[]  args) {
        initiateArray();
    }

    public static void initiateArray(){
        int lengthArray;
        do {
            System.out.print("Please enter the array size(simple integer): ");
            if ((lengthArray = getInput().nextInt()) <= 0) {
                System.out.println("Incorrect number entered! Please try again!");
            } else {
                System.out.println("Size array is: " + lengthArray);
                break;
            }
        } while (true);
        createArrayUsingScanner(lengthArray);
    }

    public static void createArrayUsingScanner(int lengthArray){
        int[] array = new int[lengthArray];

        System.out.print("Enter the array elements: ");
        for (int index = 0; index < array.length; index++) {
            array[index] = getInput().nextInt();
            System.out.println(Arrays.toString(array));
        }
    }

    public static void createArrayRandom(int lengthArray){
        int[] digits = new int[lengthArray];

        Random input = new Random();

        for (int index = 0; index < digits.length; index++) {
            digits[index] = input.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(digits));
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }

}
