import java.util.*;

class Solution {
    
    static List<Integer>[] graph;
    static int[] dist;
    
    public int solution(int n, int[][] edge) {
        graph = new List[n + 1];
        dist = new int[n + 1];
        
        Arrays.fill(dist, -1);
        for(int i = 0; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] e : edge){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        
        
        return bfs(n);
    }
    
    static int bfs(int n){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(1);
        dist[1] = 0;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            for(int next : graph[cur]){
                if(dist[next] == -1){
                    q.add(next);
                    dist[next] = dist[cur] + 1;
                }
            }
        }
        
        int maxDist = 0;
        for(int i = 1; i <= n; i++){
            maxDist = Math.max(maxDist, dist[i]);
        }
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(dist[i] == maxDist){
                cnt++;
            }
        }
        
        return cnt;
    }
}