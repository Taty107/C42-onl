package guess_the_word_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
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
        Random random = new Random();
        int randomIndex = random.nextInt(word.length);
        String randomWord = word[randomIndex].toLowerCase();
        createGame(randomWord);
    }

    public static void createGame(String randomWord){
        int numberTry = 5;
        char[] guessWord = new char[randomWord.length()];
        Arrays.fill(guessWord, '*');
        System.out.println("Добро пожаловать в игру 'Угадай Слово'!");
        System.out.println("Тема загаданого слова 'ПУТЕШЕСТВИЕ'!");
        System.out.println("И вот твоя первая подсказка.");
        System.out.println("В загаданом слове " + randomWord.length() + " букв.");

        while (numberTry > 0) {
            System.out.println("Слово сейчас: " + String.valueOf(guessWord));
            System.out.println("У вас осталось " + numberTry + " попыток");
            System.out.print("Пожалуйста введите букву: ");
            char guessLetter = getInput().next().toLowerCase().charAt(0);
            boolean foundAny = false;
            for (int index = 0; index < randomWord.length(); index++) {
                if (randomWord.charAt(index) == guessLetter) {
                    guessWord[index] = guessLetter;
                    foundAny = true;
                }
            }
            if (foundAny) {
                System.out.println("Буква " + guessLetter + " найдена.");
            } else {
                System.out.println("Такой буквы в слове нет. Попробуйте еще раз.");
                numberTry--;
            }
            if (!String.valueOf(guessWord).contains("*")) {
                System.out.println("Поздравляем вы победили!");
                break;
            }
            if (numberTry == 0) {
                System.out.println("Игра окончена!");
                System.out.println("Загаданное слово " + randomWord);
            }
        }

    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }
}
