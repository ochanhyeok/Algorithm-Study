import java.io.*;
import java.util.*;

public class Main{
    
    static int N, M;
    static int[][] grid;
    static boolean[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        grid = new int[N][M];
        
        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                grid[i][j] = line.charAt(j) - '0';
            }
        }
        
        int result = bfs();
        System.out.println(result);
    }
    
    static int bfs(){
        Queue<int[]> q = new LinkedList<>();
        visited = new boolean[N][M][2];
        q.add(new int[]{0, 0, 0, 1});
        visited[0][0][0] = true;
        
        if(N == 1 && M == 1) return 1;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], broken = cur[2], dist = cur[3];
            
            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                
                if(nx == N - 1 && ny == M - 1){
                    return dist + 1;
                }
                
                if(grid[nx][ny] == 0 && !visited[nx][ny][broken]){
                    visited[nx][ny][broken] = true;
                    q.add(new int[]{nx, ny, broken, dist + 1});
                } else if(grid[nx][ny] == 1 && broken == 0 && !visited[nx][ny][1]){
                    visited[nx][ny][1] = true;
                    q.add(new int[]{nx, ny, 1, dist + 1});
                }
            }
        }
        return -1;
    }
}