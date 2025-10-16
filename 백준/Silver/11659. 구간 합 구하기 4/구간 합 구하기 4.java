import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 누적합 방법 사용해야 시간초과 안뜸
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] prefixSum = new int[n + 1]; // 1번 인덱스부터

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            int num= Integer.parseInt(st.nextToken());
            prefixSum[i] = prefixSum[i - 1] + num;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int result = prefixSum[y] - prefixSum[x - 1];

            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }
}