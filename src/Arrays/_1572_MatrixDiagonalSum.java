package Arrays;

/**
 * @author Ahmed Nabil
 */
public class _1572_MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        int n = mat.length;
        for(int i=0; i<n; i++) {
            ans += mat[i][i];
            ans += n-i-1 == i ? 0 : mat[i][n-i-1];
        }
        return ans;
    }
}
