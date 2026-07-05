package tic_tac_toe_game;

public class Board {
    private char[][] grid;

    public Board() {
        grid = new char[][] {
                {'~', '~', '~'},
                {'~', '~', '~'},
                {'~', '~', '~'}
        };
    }

    public void printBoard(){
        System.out.println("Поле: ");
        System.out.println("  0    1    2");
        for (int x = 0; x < 3; x++) {
            System.out.print(x + " ");
            for (int y = 0; y < 3; y++){
                System.out.print(" " + grid[x][y] + " ");
                if (y < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (x < 2) {
                System.out.println(" -------------");
            }
        }
        System.out.println();
    }

    public boolean makeMove(int row, int col, char symbol){
        if (row >= 0 && row < 3 && col >= 0 && col < 3){
            if (grid[row][col] == '~') {
                grid[row][col] = symbol;
                return true;
            }
        }
        return false;
    }

    public boolean fullBoard(){
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (grid[x][y] == '~') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin(char symbol) {
        for (int x = 0; x < 3; x++) {
            if (grid[x][0] == symbol && grid[x][1] == symbol && grid[x][2] == symbol){
                return true;
            }
        }

        for (int x = 0; x < 3; x++) {
            if (grid[0][x] == symbol && grid[1][x] == symbol && grid[2][x] == symbol) {
                return true;
            }
        }

        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) {
            return true;
        }

        if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public void resetBoard(){
        for (int x = 0; x <3; x++){
            for (int y = 0; y < 3; y++) {
                grid[x][y] = '~';
            }
        }
    }
}
