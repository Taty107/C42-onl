package homework12.additional_task;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        useTerminalCalculator();
    }
    public static void useTerminalCalculator(){
        System.out.println("Welcome to CALCULATOR.");
        System.out.print("Please, enter an expression and I will calculate: ");

        // ДОЛЖНА проверка? Соответствует ли ВЫРАЖЕНИЕ ПРАВИЛАМ
        // 1. Вообще выражение это выражение???? - "Привет"
        // 2. Если выражение есть, правильно ли оно прописано? - ТОЛЬКО ЧИСЛА, и СПЕЦ СИМВОЛЫ -, +, %, *, /
        String expression = new Scanner(System.in).nextLine();

        // 1. Как мне достать из моей строки все переменные?
        // 2. Надо их достать, и... ?
        // 3. Надо достать операции - *, +, -, /
        // 4. Достал, а что дальше?
        // 5. Арифметическая очередность - как обработать правильно выражение?

        // Есть спецсимволы, которые что-то обозначают кроме просто СИМВОЛА
        // *, -, .
        String[] variables = expression.split("[-*+/]");
        System.out.println(Arrays.toString(variables));

        String[] operators = expression.split("[0-9]+"); // ТОЛЬКО ОДИН СИМВОЛ 13 -> РЕШИТЬ ЭТОТ ВОПРОС?????
        System.out.println(Arrays.toString(operators));
        // Напишите МНЕ ОСТАЛЬНОЙ КОД
        // Пусть просто возьмет все переменные и все операторы и ПОД ЦЕПОЧКЕ произведет ОПЕРАЦИИ
        // 12+1/5*12-1 -> 12 + 1 -> /5 -> *12 - 1 = ????
        int result = Integer.parseInt(variables[0]);
        for (int index =0; index < operators.length - 1; index++){
            String operator = operators[index + 1];
            int nextVariables = Integer.parseInt(variables[index + 1]);
            if (operator.equals("+")) {
                result += nextVariables;
            } else if (operator.equals("-")) {
                result -= nextVariables;
            } else if (operator.equals("/")) {
                result /= nextVariables;
            } else if (operator.equals("*")) {
                result *= nextVariables;
            }
        }
        System.out.println("Result = " + result);

        // Правильно вычислить выражение 12+1/5*12-1 == (((1/5) * 12) + 12) - 1 = 71

    }

}
