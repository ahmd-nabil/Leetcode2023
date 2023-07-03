package DynamicProgramming;

import java.util.List;
/**
 * @author Ahmed Nabil
 */
public class _120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for(int i=n-2; i>=0; i--) {
            List<Integer> row = triangle.get(i);
            for(int j=0; j<row.size(); j++) {
                row.set(j, Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)) + triangle.get(i).get(j));
            }
        }
        return triangle.get(0).get(0);
    }
}
