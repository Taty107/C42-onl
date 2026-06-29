package homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        taskOne();
        taskTwo();
        taskFour();
        taskThree();
        taskFive();
    }

    public static void taskOne(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int a = input.nextInt();
        if (a % 2 == 0){
            System.out.print("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }

    public static void taskTwo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the outside temperature: ");
        int t = input.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t >= -20) {
            System.out.println("Cold");
        } else if ((t <= -5) && (t > -20)) {
            System.out.println("Normal");
        }
    }

    public static void taskThree() {
        for (int a = 10; a <= 20; a++) {
            System.out.println(a * a);
        }
    }

    public static void taskFour() {
        int a = 7;
        while (a <= 98) {
            System.out.println(a);
            a+=7;
        }
    }

    public static void taskFive() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int number = input.nextInt();
        int sum = (number * (number + 1)) / 2;
        if (number <= 0) {
            System.out.println("Вы ввели некорректное число!");
        } else {
            System.out.println("Сумма всех чисел от 1 до " + number + " равна: " + sum);
        }
    }
}