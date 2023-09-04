public class DiagonalTraverse {
    /**
     * @param matrix
     * @return
     */
    public int[] findDiagonal(int[][] matrix) {
        if (matrix.length == 0 && matrix[0].length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int row = 0;
        int column = 0;
        boolean up = true;
        int[] arr = new int[m * n];

        while (row < m && column < n) {
            // if diagonal is goinmg up
            if (up) {
                while (row > 0 && column < n - 1) {
                    arr[i++] = matrix[row][column];
                    row--;
                    column++;
                }
                arr[i++] = matrix[row][column];
                if (column == n - 1) {
                    row++;
                } else {
                    column++;
                }
            } // if diagonal is going down
            else {
                while (column > 0 && row < m - 1) {
                    arr[i++] = matrix[row][column];
                    row++;
                    column--;
                }
                arr[i++] = matrix[row][column];
                if (row == m - 1) {
                    column++;
                } else {
                    row++;
                }
            }
            // or down
            up = !up;
        }
        return arr;
    }

    public static void main(String args[]){
            int[][] matrix=[
                [1,2,3],
                [4,5,6],
                [7,8,9]
            ];
            //findDiagonal(matrix);
            System.out.println(findDiagonal(matrix));
        }

}
