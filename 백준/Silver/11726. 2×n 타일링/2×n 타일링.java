import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        dp[0] = 1; // 아무것도 안채우는 방법 1가지
        dp[1] = 1; // 2 * 1 -> 1가지

        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        // 출력할때 %10007연산을 하게되면 dp계산중 오버플로우 발생
        System.out.println(dp[n]);
    }
}