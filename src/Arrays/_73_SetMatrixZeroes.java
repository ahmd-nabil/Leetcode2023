package Arrays;

/**
 * @author Ahmed Nabil
 */
public class _73_SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] matrix2 = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                matrix2[i][j] = matrix[i][j];
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    fillRowAndColumn(matrix2, i, j, m, n);
                }
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = matrix2[i][j];
            }
        }
    }

    private void fillRowAndColumn(int[][] matrix, int i, int j, int m, int n) {
        for(int x=0; x<m; x++) {
            matrix[x][j] = 0;
        }
        for(int y=0; y<n; y++) {
            matrix[i][y] = 0;
        }
    }
}
