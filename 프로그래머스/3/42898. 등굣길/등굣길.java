import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int MOD = 1_000_000_007;
        int[][] dp = new int[m + 1][n + 1];
        
        for(int[] p : puddles){
            dp[p[0]][p[1]] = -1;
        }
        
        dp[1][1] = 1;
        
        for(int x = 1; x <= m; x++){
            for(int y = 1; y <= n; y++){
                if(dp[x][y] == -1){
                    dp[x][y] = 0;
                    continue;
                }
                if(x == 1 && y == 1){
                    continue;
                }
                
                dp[x][y] = (dp[x][y - 1] + dp[x - 1][y]) % MOD;
            }
        }
        
        return dp[m][n];
    }
}