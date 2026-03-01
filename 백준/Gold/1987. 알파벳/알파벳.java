import java.io.*;
import java.util.*;

public class Main{
    
    static int R, C, max = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[] visited = new boolean[26];
    static Character[][] arr;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        
        arr = new Character[R][C];
        
        for(int i = 0; i < R; i++){
            String str = br.readLine();
            for(int j = 0; j < C; j++){
                arr[i][j] = str.charAt(j);
            }
        }
        
        visited[arr[0][0] - 'A'] = true;
        bfs(0, 0, 1);
        
        System.out.println(max);
    }
    
    static void bfs(int x, int y, int cnt){
        max = Math.max(cnt, max);
        
        for(int d = 0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            if(nx >= 0 && ny >= 0 && nx < R && ny < C){
                int alpha = arr[nx][ny] - 'A';
                if(!visited[alpha]){
                    visited[alpha] = true;
                    bfs(nx, ny, cnt + 1);
                    visited[alpha] = false;
                }
            }
        }
    }
}