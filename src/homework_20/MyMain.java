package homework_20;

import homework_20.task1.MaximumValue;
import homework_20.task1.MinimumValue;
import homework_20.task3.Customer;
import homework_20.task3.Producer;
import homework_20.task3.Store;

import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("~".repeat(70));
        System.out.println("Task 1");
        findMaxAndMinInArrayUsingThread();
        System.out.println("~".repeat(70));
        System.out.println("Task 2");
        sortArrayUsingDifferentAlgorithms();
        System.out.println("~".repeat(70));
        System.out.println("Task *");

        Store store = new Store();
        Producer producer = new Producer(store);
        Customer customer = new Customer(store);

        new Thread(producer, "Producer").start();
        new Thread(customer, "Customer").start();
        System.out.println("~".repeat(70));
    }

    public static void findMaxAndMinInArrayUsingThread() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Please enter the array elements: ");
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        MaximumValue maximumValue = new MaximumValue(numbers);
        MinimumValue minimumValue = new MinimumValue(numbers);

        Thread task1 = new Thread(maximumValue);
        Thread task2 = new Thread(minimumValue);

        task1.start();
        task2.start();

        try {
            task1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            task2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int maxResult = maximumValue.getMaxValue();
        int minResult = minimumValue.getMinValue();

        System.out.println("Maximum value is: " + maxResult);
        System.out.println("Minimum value is: " + minResult);
    }

    public static void sortArrayUsingDifferentAlgorithms() {
        int[] originalArray = {9, 0, 11, 3, 6, 8, 1, -1};

        Thread insertionSortThread = new Thread(() -> {
            int[] array = Arrays.copyOf(originalArray, originalArray.length);
            for (int index = 1; index < array.length; index++) {
                int x = array[index];
                int y = index - 1;
                while (y >= 0 && array[y] > x) {
                    array[y + 1] = array[y];
                    y--;
                }
                array[y + 1] = x;
            }
            System.out.println("Insertion sort: " + Arrays.toString(array));
        });

        Thread selectionSortThread = new Thread(() -> {
            int[] array = Arrays.copyOf(originalArray, originalArray.length);
            for (int index = 0; index < array.length - 1; index++) {
                int minIndex = index;
                for (int x = index + 1; x < array.length; x++) {
                    if (array[x] < array[minIndex]) {
                        minIndex = x;
                    }
                }
                int temp = array[minIndex];
                array[minIndex] = array[index];
                array[index] = temp;
            }
            System.out.println("Selection sort: " + Arrays.toString(array));
        });

        Thread bubbleSortThread = new Thread(() -> {
            int[] array = Arrays.copyOf(originalArray, originalArray.length);
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println("Bubble sort: " + Arrays.toString(array));
        });
        insertionSortThread.start();
        selectionSortThread.start();
        bubbleSortThread.start();
    }

}
