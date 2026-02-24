import java.io.*;
import java.util.*;

public class Main{
    
    static List<Integer>[] graph;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        graph = new List[N + 1];
        
        for(int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        for(int i = 1; i <= N; i++){
            Collections.sort(graph[i]);
        }
        
        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();
        visited = new boolean[N + 1];
        bfs(V);
    }
    
    static void dfs(int cur){
        visited[cur] = true;
        System.out.print(cur + " ");
        for(int next : graph[cur]){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
    
    static void bfs(int cur){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(cur);
        visited[cur] = true;
        
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");
            for(int next : graph[node]){
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}