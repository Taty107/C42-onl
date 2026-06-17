package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main(String[]  args) {
        System.out.println("Homework 4");
        System.out.println("Creating an array to perform the following tasks: ");
        int[] array;
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
        /*
        array = new int[lengthArray];

        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * 100);
        } */

        array = new int[lengthArray];

        System.out.print("Enter the array elements: ");
        for (int index = 0; index < array.length; index++) {
            array[index] = getInput().nextInt();
            System.out.println(Arrays.toString(array));
        }

        System.out.println("-".repeat(50));
        System.out.println("Task 1");
        readArrayForwardAndBackward(array);
        System.out.println("-".repeat(50));
        System.out.println("Task 2");
        findMaxMinElement(array);
        System.out.println("-".repeat(50));
        System.out.println("Task 3");
        getIndexMaxMinElement(array);
        System.out.println("-".repeat(50));
        System.out.println("Task 4");
        getAmountZeroElements(array);
        System.out.println("-".repeat(50));
        System.out.println("Task 5");
        //swapVariable(array);
        System.out.println("-".repeat(50));
        System.out.println("Task 6");
        isIncreasing(array);
        System.out.println("-".repeat(50));
        System.out.println("Task 7*");
        addOne(array);
        System.out.println("-".repeat(50));

    }

    public static void readArrayForwardAndBackward(int[] array){
        System.out.println("Read the array in direct order: ");
        for (int el : array){
            System.out.println(el);
        }

        System.out.println("Read the array in reverse order: ");
        for (int index = array.length -1; index >= 0; index--) {
            System.out.println(array[index]);
        }
    }

    public static void findMaxMinElement(int[] array){
        System.out.print("The minimum element of the array is: ");
        int min = array[0];
        System.out.println(min);

        System.out.print("The maximum element of the array is: ");
        int max = array[array.length -1];
        System.out.println(max);
    }

    public  static void getIndexMaxMinElement(int[] array) {
        System.out.print("Index of the maximum element of the array is: ");
        int maxIndex = 0;
        for (int index =1; index < array.length; index++) {
            if (array[index] > array[maxIndex]) {
                maxIndex = index;
            }
        }
        System.out.println(maxIndex);
        System.out.print("Index of the minimum element of the array is: ");
        int minIndex = 0;
        for (int index =1; index < array.length; index++) {
            if (array[index] < array[minIndex]) {
                minIndex = index;
            }
        }
        System.out.println(minIndex);
    }

    public static void getAmountZeroElements(int[] array) {
        System.out.print("The number of zero elements in the array: ");
        int zeroEl = 0;
        int count = 0;

        for (int numbers : array) {
            if (numbers == zeroEl) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void swapVariable(int[] array) {
        System.out.println("The array before the elements are rearranged: " + Arrays.toString(array));

        int a = array[0];
        array[0] = array[array.length - 1];
        array[array.length -1] = a;
        int b = array[1];
        array[1] = array[array.length - 2];
        array[array.length - 2] = b;
        System.out.println("The array after the elements are rearranged: " + Arrays.toString(array));

    }

    public static void isIncreasing(int[] array) {
        System.out.println("Is the array an ascending sequence?");
        boolean increasing = true;
        for (int index = 1; index < array.length; index++) {
            if (array[index] <= array[index - 1]) {
                increasing = false;
                break;
            }
        }
        System.out.println(increasing);

    }

    public static void addOne(int[] array) {
        System.out.println("Original array is: " + Arrays.toString(array));
        for (int index = array.length -1; index >= 0; index--) {
             if (array[index] <9) {
                 array[index]++;
                 break;
             }
             array[index] = 0;
        }
        System.out.println("After adding a unit to the array " + Arrays.toString(array));

        int[] newArray = new int[array.length + 1];
        newArray[0] = 1;
        System.out.println("After adding a unit to the array " + Arrays.toString(newArray));
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }

}
