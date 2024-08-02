public class setMatrixZeros {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowsZero = new boolean[rows];
        boolean[] colsZero = new boolean[cols];

        // First pass: Identify the rows and columns that need to be zeroed
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowsZero[i] = true;
                    colsZero[j] = true;
                }
            }
        }

        // Second pass: Zero out the identified rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowsZero[i] || colsZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args){

    }
}
