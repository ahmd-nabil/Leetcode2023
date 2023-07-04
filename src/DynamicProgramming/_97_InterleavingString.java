package DynamicProgramming;

/**
 * @author Ahmed Nabil
 */
public class _97_InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length();
        if(n + m != s3.length()) return false;
        boolean[][] inter = new boolean[n+1][m+1]; // interleaving
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=m; j++) {
                if(i == 0 && j == 0) inter[i][j] = true;
                else if(i == 0) inter[i][j] = inter[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
                else if(j == 0) inter[i][j] = inter[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1);
                else inter[i][j] = (inter[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1))
                            || (inter[i-1][j] && s1.charAt(i-1) == s3.charAt(j+i-1));
            }
        }
        return inter[n][m];
    }
}
