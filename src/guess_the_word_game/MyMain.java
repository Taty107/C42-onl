package guess_the_word_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        createGame();
    }

    public static void createGame(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] word = new String[]{
                "Приключение",
                "Бронирование",
                "Круиз",
                "Маршрут",
                "Впечатление",
                "Аэропорт",
                "Экскурсия",
                "Турист",
                "Путеводитель",
                "Сувенир",
                "Гид",
                "Карта",
                "Отель",
                "Пляж",
                "достопримечательность",
                "Фотография",
                "Паром",
                "Таможня",
                "Компас",
                "Палатка",
                "Странствие"};
        boolean playAAgain;

        do {
            int randomIndex = random.nextInt(word.length);
            String randomWord = word[randomIndex].toLowerCase();
            int numberTry = 5;
            char[] guessWord = new char[randomWord.length()];
            Arrays.fill(guessWord, '*');

            System.out.println("Добро пожаловать в игру 'Угадай Слово'!");
            System.out.println("Тема загаданого слова 'ПУТЕШЕСТВИЕ'!");
            System.out.println("И вот ваша первая подсказка.");
            System.out.println("В загаданом слове " + randomWord.length() + " букв.");

            while (numberTry > 0) {
                System.out.println("~".repeat(100));
                System.out.println("Слово сейчас: " + String.valueOf(guessWord));
                System.out.println("У вас осталось " + numberTry + " попыток");
                System.out.print("Пожалуйста введите слово целиком или одну букву: ");

                String tryGuessWord = input.nextLine().toLowerCase();

                System.out.println();

                if (tryGuessWord.length() > 1) {
                    if (tryGuessWord.equals(randomWord)) {
                        guessWord = randomWord.toCharArray();
                        System.out.println("Отлично! Вы угадали слово целиком " + randomWord);
                        break;
                    } else {
                        numberTry--;
                        System.out.println("Нет, слово не верно!");
                        System.out.println("У вас осталось " + numberTry + " попыток.");
                    }
                } else if (tryGuessWord.length() == 1) {
                    char guessLetter = tryGuessWord.charAt(0);
                    boolean foundLetter = false;
                    for (int index = 0; index < randomWord.length(); index++) {
                        if (randomWord.charAt(index) == guessLetter) {
                            guessWord[index] = guessLetter;
                            foundLetter = true;
                        }
                    }
                    if (foundLetter) {
                        System.out.println("Буква " + guessLetter + " найдена.");
                    } else {
                        numberTry--;
                        System.out.println("Такой буквы в слове нет.");
                        System.out.println("У вас осталось " + numberTry + " попыток.");
                    }
                }
                System.out.println("~".repeat(100));
                if (!String.valueOf(guessWord).contains("*")) {
                    System.out.println("Поздравляем вы победили!");
                    break;
                }
            }
            System.out.println("~".repeat(100));
            if (numberTry == 0) {
                System.out.println("Игра окончена!");
                System.out.println("Загаданное слово " + randomWord);
            }
            System.out.println("~".repeat(100));

            System.out.println("Хотите начать игру заново?(да/нет)");
            String answer = input.nextLine().toLowerCase();
            playAAgain = answer.equals("да");
        } while (playAAgain);
        System.out.println("Спасибо за игру!");
    }
}

