package homework12.additional_task;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        turnDecimalToBinary();
    }

    public static void turnDecimalToBinary() {
        System.out.print("Please enter a decimal number to convert to a binary system: ");
        int decimal = new Scanner(System.in).nextInt();
        int counter = getNumberDivisionOnTwo(decimal,0);
        getBinary(counter - 1, decimal, new int[counter]);

        /**
        int temp_decimal_number = decimal;
        int counter = 0;
        while (temp_decimal_number > 0) {
            temp_decimal_number /= 2;
            counter++;
        }

        int[] binary = new int[counter];

        for (int index = counter - 1; decimal > 0; index--, decimal /= 2) {
            if (decimal % 2 == 0) {
                binary[index] = 0;
            } else {
               binary[index] = 1;
            }
        }

        System.out.println( " Your binary version is: ");

        for (int index = 0; index < counter; index++) {
            System.out.printf("%d", binary[index]);
        }

        System.out.println("\n");**/

        // Рекурсия МЕНЯЕТ ЦИКЛ, вместо ЦИКЛА
        // В коде используется массив, но МОГУ ЛИ Я ИСПОЛЬЗОВАТЬ РЕКУРСИЮ, ЧТОБЫ ПРОСТО ПЕРВОЕ СДЕЛАТЬ ПОСЛЕДНИМ?
        // Посмотрите ПРИМЕР - ХВОСТОВОЙ РЕКУРСИИ
    }

    public static int getNumberDivisionOnTwo(int temp_decimal_number, int tempCounter) {
        if (temp_decimal_number > 0){
            return temp_decimal_number /= 2;
        }
        return getNumberDivisionOnTwo(temp_decimal_number, tempCounter + 1);
    }

    public static void getBinary(int index, int tempDecimal, int[] binary){
        if (tempDecimal > 0) {
            getBinary(index - 1, tempDecimal / 2, binary);
            if (tempDecimal % 2 == 0) {
                binary[index] = 0;
            } else {
                binary[index] = 1;
            }
            System.out.print(binary[index]);
        }
    }
}
