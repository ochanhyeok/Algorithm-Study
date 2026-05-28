import java.util.*;

class Solution {
    
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(computers, i);
                answer++;
            }
        }        
        
        return answer;
    }
    
    static void dfs(int[][] computers, int node){
        visited[node] = true;
        for(int i = 0; i < computers.length; i++){
            if(!visited[i] && node != i && computers[node][i] == 1){
                dfs(computers, i);
            }
        }
    }
}