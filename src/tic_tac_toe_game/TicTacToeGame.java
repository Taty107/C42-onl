package tic_tac_toe_game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    private Board board;
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;

    public TicTacToeGame(){
        this.board = new Board();
        this.playerOne = new Player("Игрок", 'X', false);
        this.playerTwo = new Player("ИИ Игорь", '0', true);
    }

    public void startGame(){
        boolean playGame;
        do {
            board.resetBoard();
            chooseFirstPlayer();
            board.printBoard();

            while (true) {
                if (currentPlayer.isBot()){
                    botMove();
                } else {
                    humanMove();
                }

                board.printBoard();

                if (board.checkWin(currentPlayer.getSymbol())) {
                    System.out.println("Игра окончена! Победил " + currentPlayer.getName() + "!");
                    break;
                }

                if (board.fullBoard()) {
                    System.out.println("Ничья! Свободных клеток не осталось!");
                    break;
                }
                currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
            }

            System.out.println("Хотите начать игру заново?(да/нет)");
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine().toLowerCase();
            playGame = answer.equals("да");

        } while (playGame);
        System.out.println("Спасибо за игру!");
    }

    public void chooseFirstPlayer(){
        Random random = new Random();

        if (random.nextBoolean()) {
            playerOne.setSymbol('X');
            playerTwo.setSymbol('0');
            currentPlayer = playerOne;
            System.out.println("Выбор сделан! " + playerOne.getName() + " вы ходите первым крестиками 'X'.");
        } else {
            playerOne.setSymbol('0');
            playerTwo.setSymbol('X');
            currentPlayer = playerTwo;
            System.out.println("Выбор сделан! " + playerTwo.getName() + " ходит первым крестиками 'X'.");
        }
    }

    public void botMove(){
        Random random = new Random();
        int row, col;

        while (true) {
            row = random.nextInt(3);
            col = random.nextInt(3);

            if (board.makeMove(row, col, currentPlayer.getSymbol())){
                System.out.println(currentPlayer.getName() + " сходил на строку " + row + ", столбец " + col);
                break;
            }
        }
    }

    public void humanMove(){
        Scanner scanner = new Scanner(System.in );
        int row, col;
        while (true) {
            System.out.print(currentPlayer.getName() + " ваш ход! Введите строку и столбец (0-2) через пробел: ");
            if (scanner.hasNextInt()) {
                row = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    col = scanner.nextInt();

                    if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                        break;
                    } else {
                        System.out.println("ОШИБКА! Эта клетка занята или выходит за рамки поля.");
                    }
                }
            } else {
                System.out.println("Некорректный ввод! Пожалуйста введите два числа.");
                scanner.next();
            }
        }
    }


}
