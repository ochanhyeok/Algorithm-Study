import java.io.*;
import java.util.*;

public class Main{
    
    static int N, M, H;
    static int[][][] grid;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        
        grid = new int[H][N][M];
        
        for(int h = 0; h < H; h++){
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < M; j++){
                    grid[h][i][j] = Integer.parseInt(st.nextToken());
                    if(grid[h][i][j] == 1){
                        q.add(new int[]{h, i, j});
                    }
                }
            }
        }
        
        int result = bfs();
        System.out.println(result);
    }
    
    static int bfs(){
        while(!q.isEmpty()){
            int[] cur  = q.poll();
            int z = cur[0], x = cur[1], y = cur[2];
            
            for(int d = 0; d < 6; d++){
                int nx = cur[1] + dx[d];
                int ny = cur[2] + dy[d];
                int nz = cur[0] + dz[d];
                
                if(nx < 0 || ny < 0 || nz < 0 || nx >= N || ny >= M || nz >= H){
                    continue;
                }
                if(grid[nz][nx][ny] == -1 || grid[nz][nx][ny] == 1){
                    continue;
                }
                
                if(grid[nz][nx][ny] == 0){
                    q.add(new int[]{nz, nx, ny});
                    grid[nz][nx][ny] = grid[z][x][y] + 1;
                }
            }
        }
        
        int result = 0;
        for(int h = 0; h < H; h++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(grid[h][i][j] == 0){
                        return -1;
                    }
                    result = Math.max(result, grid[h][i][j]);
                }
            }
        }
        return result - 1;
    }
}