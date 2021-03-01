package main.java.com.mun.automated.fundamentals;

/*
Ввести с консоли n - размерность матрицы a [n] [n].
Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

n - args[0]
-M - args[1]
M - args[2]
k - args [3]
 */

import java.util.Random;

public class OptionalTask21 {
    public static void main(String[] args) {
        int matrixDimension = Integer.parseInt(args[0]);
        int[][] matrix = new int[matrixDimension][matrixDimension];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = getRandomInt(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            }
        }
        System.out.println("original matrix");
        print(matrix);

        int k = Integer.parseInt(args[3]) - 1;

        System.out.println("sort by k-column");
        sortMatrixByColumn(matrix, k);
        print(matrix);

        System.out.println("sort by k-row");
        sortMatrixByRow(matrix, k);
        print(matrix);
    }

    /* генерация рандомных чисел */
    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }

    /* сортировка по к-му столбцу */
    public static void sortMatrixByColumn (int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0 ; j < matrix.length-1; j++) {
                if (matrix[j][column] > matrix[j+1][column]) {
                    int temp = matrix[j][column];
                    matrix[j][column] = matrix[j+1][column];
                    matrix[j+1][column] = temp;
                }
            }
        }
    }

    /* сортировка по к-той строке */
    public static void sortMatrixByRow (int[][] matrix, int row) {
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0 ; j < matrix.length-1; j++) {
                if (matrix[row][j] > matrix[row][j+1]) {
                    int temp = matrix[row][j];
                    matrix[row][j] = matrix[row][j+1];
                    matrix[row][j+1] = temp;
                }
            }
        }
    }

    /* вывод на консоль матрицы */
    static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
