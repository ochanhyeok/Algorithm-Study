
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] room = new int[N][3];

        // 입력받고 2차원 배열에 저장? 시작순서 정렬 -> 회의시간이 많이 안걸리는 순으로 오름차순 정렬 ->
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());
            room[i][0] = startTime;
            room[i][1] = endTime;
            room[i][2] = endTime - startTime;
        }

        Arrays.sort(room, (a, b) -> {
            if(a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int cnt = 1;
        int lastEnd = room[0][1];
        for(int i = 1; i < room.length; i++){
            int start = room[i][0];
//            int end = room[i][1];
            if(start >= lastEnd){
                cnt++;
                lastEnd = room[i][1];
            }
        }

        System.out.println(cnt);
    }
}
