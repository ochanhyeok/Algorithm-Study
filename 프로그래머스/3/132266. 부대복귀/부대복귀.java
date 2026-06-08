import java.util.*;

class Solution {
    
    static List<Integer>[] graph;
    static int[] dist;
    
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        List<Integer> result = new ArrayList<>();
        
        graph = new List[n + 1];
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] r : roads){
            graph[r[0]].add(r[1]);
            graph[r[1]].add(r[0]);
        }
        
        for(int s : sources){
            if(s == destination){
                result.add(0);
                continue;
            }
            dist = new int[n + 1];
            Arrays.fill(dist, -1);
            dist[s] = 0;
            result.add(bfs(s, destination));
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    static int bfs(int node, int dest){
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
    
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int next : graph[cur]){
                if(dist[next] == -1){
                    dist[next] = dist[cur] + 1;
                    q.offer(next);
                } 
            }
        }
        
        return dist[dest];
    }
}