import java.io.*;
import java.util.*;

public class Main{
    
    static int N;
    static int[] x, y;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        for(int t = 0; t < T; t++){
            N = Integer.parseInt(br.readLine());
            x = new int[N + 2];
            y = new int[N + 2];
            for(int i = 0; i < N + 2; i++){
                st = new StringTokenizer(br.readLine());
                x[i] = Integer.parseInt(st.nextToken());
                y[i] = Integer.parseInt(st.nextToken());
            }
            
            if(bfs()){
                sb.append("happy\n");
            } else {
                sb.append("sad\n");
            }
        }
        
        System.out.println(sb);
    }
    
    static boolean bfs(){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[N + 2];
        q.add(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            if(cur == N + 1) return true;
            
            for(int next = 1; next < N + 2; next++){
                if(!visited[next]){
                    int dist = Math.abs(x[next] - x[cur])
                        + Math.abs(y[next] - y[cur]);
                    if(dist <= 1000){
                        visited[next] = true;
                        q.add(next);
                    }
                }
            }
        }
        
        return false;
    }
}