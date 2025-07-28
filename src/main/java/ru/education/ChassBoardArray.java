package ru.education;

public class ChassBoardArray {
    // Метод возвращает координату клетки на шахматной доске
    public static String chessBoardCoord(int x, int y) {
        String letters = "abcdefgh";
        String numbers = "87654321";

        if ((x >= 8) || (y >= 8))
            return null;

        return Character.toString(letters.charAt(x)) + numbers.charAt(y); // возвращаем строку вида 'a8', 'h1' и т.п.
    }

    // Главный метод, в котором выполняется логика программы
    public static void main(String[] args) {
        // Создаем массив размером 8х8 строковых элементов
        String[][] chessBoard = new String[8][8];

        // Заполняем каждую клетку доски значением цвета и координат
        for (int i = 0; i < chessBoard.length; i++) {   // Проходим по рядам
            for (int j = 0; j < chessBoard[i].length; j++) {  // Проходим по столбцам
                if ((i + j) % 2 == 0)
                    chessBoard[i][j] = "W" + chessBoardCoord(i,j); // Белые поля обозначены буквой W
                else
                    chessBoard[i][j] = "B" + chessBoardCoord(i,j); // Черные поля обозначены буквой B
            }
        }

        // Выводим содержимое двумерного массива на экран
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " "); // Добавляем пробелы между элементами
            }
            System.out.println(); // Переход на новую строку после каждой строки доски
        }
    }
}