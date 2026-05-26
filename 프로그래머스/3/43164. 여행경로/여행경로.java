import java.util.*;

class Solution {
    
    static boolean[] visited;
    static String[] answer;
    static boolean found;
    
    public String[] solution(String[][] tickets) {
        int N = tickets.length;
        
        visited = new boolean[N + 1];
        answer = new String[N + 1];
        
        Arrays.sort(tickets, (a, b) -> {
            if(!a[0].equals(b[0])){
                return a[0].compareTo(b[0]);
            }
            return a[1].compareTo(b[1]);
        });
        
        answer[0] = "ICN";
        dfs("ICN", 0, tickets);
        
        return answer;
    }
    
    static void dfs(String cur, int depth, String[][] tickets){
        if(depth == tickets.length){
            found = true;
            return;
        }
        
        for(int i = 0; i < tickets.length; i++){
            if(!visited[i] && cur.equals(tickets[i][0])){
                visited[i] = true;
                answer[depth + 1] = tickets[i][1];
                dfs(tickets[i][1], depth + 1, tickets);
                if(found){
                    return;
                }
                visited[i] = false;
            }
        }
    }
}