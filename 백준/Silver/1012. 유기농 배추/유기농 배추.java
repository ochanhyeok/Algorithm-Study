import java.io.*;
import java.util.*;
public class Main{
    static int[][] field;
    static boolean[][] visited;
    static int n, m;

    // 상하좌우 방향
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // 배열 초기화
            field = new int[n][m];
            visited = new boolean[n][m];

            // 배추 위치 입력
            for(int i = 0; i < k; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[y][x] = 1;
            }

            int cnt = 0;

            // 전체 배열 탐색
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    // 배추가 있고 아직 방문하지 않은 경우
                    if(field[i][j] == 1 && !visited[i][j]){
                        dfs(i, j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    static void dfs(int x, int y){
        visited[x][y] = true;

        // 상하좌우 4방향 탐색
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위 체크
            if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                // 배추가 있고 아직 방문하지 않은 경우
                if(field[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx, ny); // 재귀
                }
            }
        }
    }
}