import java.io.*;
import java.util.*;

public class Main{
    
    static int N, M;
    static int max = 0;
    static int[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        grid = new int[N][M];
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        placeWall(0);
        
        System.out.println(max);
    }
    
    static void placeWall(int cnt){
        if(cnt == 3){
            max = Math.max(max, bfs());
            return;
        }
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(grid[i][j] == 0){
                    grid[i][j] = 1; // 벽세움
                    placeWall(cnt + 1);
                    grid[i][j] = 0;
                }
            }
        }
    }
    
    static int bfs(){
        int[][] temp = new int[N][M];
        Queue<int[]> q = new LinkedList<>();
        
        //  큐에 바이러스의 전파 전 위치를 저장
        for(int i = 0; i < N; i++){
            temp[i] = grid[i].clone();
            for(int j = 0; j < M; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                }                
            }
        }
        
        // 큐를 탐색하며 바이러스를 전파
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            
            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx < 0 || nx >= N || ny < 0 || ny >= M){
                    continue;
                }
                
                if(temp[nx][ny] == 0){
                    temp[nx][ny] = 2;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        
        
        int safe = 0;
        for(int[] row : temp){
            for(int v : row){
                if(v == 0){
                    safe++;
                }
            }
        }
        
        return safe;
    }
}