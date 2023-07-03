package DynamicProgramming;
import java.util.Arrays;

/**
 * @author Ahmed Nabil
 */
public class _64_MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] minGrid = new int[m][n];
        Arrays.stream(minGrid).forEach(arr->Arrays.fill(arr, Integer.MAX_VALUE));
        minGrid[0][0] = grid[0][0];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i-1 >= 0) minGrid[i][j] = Math.min(minGrid[i][j], minGrid[i-1][j] + grid[i][j]);
                if(j-1 >= 0) minGrid[i][j] = Math.min(minGrid[i][j], minGrid[i][j-1] + grid[i][j]);
            }
        }
        return minGrid[m-1][n-1];
    }

    public int minPathSum_inPlace(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i != 0 && j != 0) grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                else if(i != 0 && j == 0) grid[i][j] += grid[i-1][j];
                else if(i == 0 && j != 0) grid[i][j] += grid[i][j-1];
            }
        }
        return grid[m-1][n-1];
    }
}
