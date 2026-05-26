import java.util.*;

class Solution {
    
    static int[][] dist;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M;
    
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        dist = new int[N][M];
        
        return bfs(maps);
    }
    
    static int bfs(int[][] maps){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        dist[0][0] = 1;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            
            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                
                if(dist[nx][ny] == 0 && maps[nx][ny] == 1){
                    q.offer(new int[]{nx, ny});
                    dist[nx][ny] = dist[x][y] + 1;
                }
            }
        }
        
        if(dist[N - 1][M - 1] == 0){
            return -1;
        }
        
        return dist[N - 1][M - 1];
    }
}