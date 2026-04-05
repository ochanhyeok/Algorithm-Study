import java.io.*;
import java.util.*;

public class Main{
    
    static int n;
    static int[] x, y;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            n = Integer.parseInt(br.readLine());
            x = new int[n + 2];
            y = new int[n + 2];
            
            for(int j = 0; j <= n + 1; j++){
                st = new StringTokenizer(br.readLine());
                x[j] = Integer.parseInt(st.nextToken());
                y[j] = Integer.parseInt(st.nextToken());
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
        boolean[] visited = new boolean[n + 2];
        q.add(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            if(cur == n + 1) return true;
            
            for(int next = 1; next <= n + 1; next++){
                if(!visited[next]){
                    int dist = Math.abs(x[cur] - x[next])
                                + Math.abs(y[cur] - y[next]);
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