import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //DP로 풀이
        /*
        1. 메모이제이션: 계산 결과를 저장
        2. Bottom-up: 작은 것부터 차례로
        3. 재사용: 저장된 값을 활용
        */
        int[] fb = new int[41];
        fb[0] = 0;
        fb[1] = 1;

        for(int i = 2; i <= 40; i++){
            fb[i] = fb[i - 1] + fb[i - 2];
//            System.out.println("fb[" + i + "] = " + fb[i]);
        }

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                sb.append("1 0\n");
            }else{
                // fibonacci(N)에서 fib(0) 호출 횟수 = fib[N-1]
                // fibonacci(N)에서 fib(1) 호출 횟수 = fib[N]
                sb.append(fb[n - 1]).append(' ').append(fb[n]).append('\n');
            }
        }
        System.out.println(sb);
    }
}