package tic_tac_toe_game;

public class Player {
    private String name;
    private char symbol;
    private boolean isBot;

    public Player(String name, char symbol, boolean isBot) {
        this.name = name;
        this.symbol = symbol;
        this.isBot = isBot;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public boolean isBot() {
        return isBot;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
