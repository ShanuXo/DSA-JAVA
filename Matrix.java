import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        matrix(arr, 4, 5);

    }

    public static int matrix(int[][] m, int a, int b) {
        m = new int[a][b];
        int row = m.length;
        int column = m[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                return m[i][j];
            }
        }
        return m[row][column];
    }

}
