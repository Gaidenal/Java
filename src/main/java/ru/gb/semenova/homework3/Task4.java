package ru.gb.semenova.homework3;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

public class Task4 {
    public static void main(String[] args){

        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][i] = 1;
                if (j == table.length -1 - i) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");

            }
            System.out.println();
        }

    }
}
