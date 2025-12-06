import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] times = new int[n];
        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(st.nextToken());
            times[i] = number;
        }

        Arrays.sort(times); // 오름차순

        int totalTime = 0;
        int cumulativeTime = 0; // 누적시간

        for (int i = 0; i < n; i++) {
            cumulativeTime += times[i];
            totalTime += cumulativeTime;
        }

        System.out.println(totalTime);
        
    }
}