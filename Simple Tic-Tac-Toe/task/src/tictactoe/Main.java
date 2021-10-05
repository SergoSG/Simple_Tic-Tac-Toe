package tictactoe;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        char[][] table = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        boolean isXStep = true;

        printTable(table);
        while (checkResult(table)) {
            table = checkEnter(table, isXStep);
            printTable(table);
            isXStep = !isXStep;
        }
    }

    public static boolean checkResult(char[][] table) {
        int cntX = 0;
        int cntO = 0;
        boolean isNotFinished = false;
        boolean isXWins = false;
        boolean isOWins = false;
        boolean res;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == ' ') {
                    isNotFinished = true;
                    break;
                }
            }
        }

        String row1 = new StringBuilder().append(table[0][0]).append(table[0][1]).append(table[0][2]).toString();
        String row2 = new StringBuilder().append(table[1][0]).append(table[1][1]).append(table[1][2]).toString();
        String row3 = new StringBuilder().append(table[2][0]).append(table[2][1]).append(table[2][2]).toString();

        String col1 = new StringBuilder().append(table[0][0]).append(table[1][0]).append(table[2][0]).toString();
        String col2 = new StringBuilder().append(table[0][1]).append(table[1][1]).append(table[2][1]).toString();
        String col3 = new StringBuilder().append(table[0][2]).append(table[1][2]).append(table[2][2]).toString();

        String diagonal1 = new StringBuilder().append(table[0][0]).append(table[1][1]).append(table[2][2]).toString();
        String diagonal2 = new StringBuilder().append(table[0][2]).append(table[1][1]).append(table[2][0]).toString();
        if (col1.equals("XXX") || col2.equals("XXX") || col3.equals("XXX") ||
                row1.equals("XXX") || row2.equals("XXX") || row3.equals("XXX") ||
                diagonal1.equals("XXX") || diagonal2.equals("XXX")) {
            isXWins = true;
        }

        if (col1.equals("OOO") || col2.equals("OOO") || col3.equals("OOO") ||
                row1.equals("OOO") || row2.equals("OOO") || row3.equals("OOO") ||
                diagonal1.equals("OOO") || diagonal2.equals("OOO")) {
            isOWins = true;
        }

        if (Math.abs(cntX - cntO) > 1 || (isXWins && isOWins)) {
            System.out.println("Impossible");
            res = true;
        } else if (isXWins) {
            System.out.println("X wins");
            res = false;
        } else if (isOWins) {
            System.out.println("O wins");
            res = false;
        } else {
            if (isNotFinished) {
                res = true;
            } else {
                System.out.println("Draw");
                res = false;
            }
        }
        return res;
    }

    public static char[][] checkEnter(char[][] table, boolean isXStep) {
        int posX = 0;
        int posY = 0;
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        while (isContinue) {
            System.out.print("Enter the coordinates: ");
            if (scanner.hasNextInt()) {
                posY = scanner.nextInt();
            } else {
                scanner.next();
                scanner.next();
                System.out.println("You should enter numbers!");
                continue;
            }

            if (scanner.hasNextInt()) {
                posX = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("You should enter numbers!");
                continue;
            }

            if (posX < 1 || posX > 3 || posY < 1 || posY > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            if (table[posY - 1][posX - 1] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            if (isXStep) {
                table[posY - 1][posX - 1] = 'X';
            } else {
                table[posY - 1][posX - 1] = 'O';
            }

            isContinue = false;
        }
        return table;
    }

    public static void printTable(char[][] table) {
        System.out.println("---------");
        for (char[] row : table) {
            System.out.print("| ");
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}
