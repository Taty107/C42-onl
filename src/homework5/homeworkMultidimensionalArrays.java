package homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homeworkMultidimensionalArrays {
    public static void main(String[] args) {
        System.out.println("Homework 5");
        System.out.println("-".repeat(50));
        System.out.println("Task 1");
        createTwoDimensionalArray();
        System.out.println("-".repeat(50));
        System.out.println("Task 2");
        createColoringArray();
        System.out.println("-".repeat(50));
        System.out.println("Task 3*");
        fillArraySnake();
        System.out.println("-".repeat(50));
    }

    public static void createTwoDimensionalArray() {
        System.out.println("*".repeat(50));
        System.out.println("Task 1.1 Create two-dimensional Array and fill it random.");
        int rows = 5;
        int col = 3;
        int[][] twoDimArr = new int[rows][col];
        Random random = new Random();
        for (int a = 0; a < twoDimArr.length; a++) {
            for (int b = 0; b < twoDimArr[a].length; b++) {
                twoDimArr[a][b] = random.nextInt(100);
            }
        }
        System.out.println("Filled two-dimensional array: ");
        for (int[] row : twoDimArr){
            System.out.println(Arrays.toString(row));
        }

        System.out.println("*".repeat(50));
        System.out.println("Task 1.2 Edd the number entered from the console to each value.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to add: ");
        int numToAdd = input.nextInt();
        for (int x = 0; x < twoDimArr.length; x++) {
            for (int y = 0; y < twoDimArr[x].length; y++) {
                twoDimArr[x][y] += numToAdd;
            }
        }
        System.out.println("Modified array: ");
        for (int[] row : twoDimArr){
            System.out.println(Arrays.toString(row));
        }

        System.out.println("*".repeat(50));
        System.out.println("Task 1.3 Find the sum of all the resulting elements.");

        int sum = 0;

        for (int[] row : twoDimArr) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("The sum of all elements of the array: " + sum);

    }

    public static void createColoringArray() {
        System.out.println("Create a program for coloring a chessboard using a loop.");
        int size = 8;
        String[][] coloringArray = new String[size][size];
        for (int a = 0; a < size; a++) {
            for (int b = 0; b < size; b++) {
                if ((a+b) % 2 == 0) {
                    coloringArray[a][b] = "W";
                } else {
                    coloringArray[a][b] = "B";
                }
            }
        }
        for (int a = 0; a < size; a++) {
            for (int b = 0; b < size; b++) {
                System.out.print(coloringArray[a][b] + "\t");
            }
            System.out.println();
        }
    }

    public static void fillArraySnake() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of lines: ");
        int lines = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int column = input.nextInt();
        int[][] snakeArray = new int[lines][column];
        int firstNum = 0;

        for (int row = 0; row < lines; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < column; col++) {
                    snakeArray[row][col] = firstNum++;
                }
            } else {
                for (int col = column -1; col >= 0; col--) {
                    snakeArray[row][col] = firstNum++;
                }
            }
        }

        System.out.println("Snake array is: ");
        for (int row = 0; row < lines; row++) {
            for (int col = 0; col < column; col++) {
                System.out.printf("%3d", snakeArray[row][col]);
            }
            System.out.println();
        }


    }
}
