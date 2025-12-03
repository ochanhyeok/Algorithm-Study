import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] wall = new boolean[n];
        
        // boolean 배열 wall에 페인트 칠할 구역을 true 변경
        for(int i = 0; i < section.length; i++){
            wall[section[i] - 1] = true;
        }
        
        // System.out.println(Arrays.toString(wall));
        
        // 벽을 한칸씩 체크하고 true(칠할구역)면 그칸부터 +m 번째까지 칠함
        for(int i = 0; i < wall.length; i++){
            int cnt = 0;
            if(wall[i]){
                for(int j = 1; j < m; j++){
                    if(i + j < wall.length){
                        wall[i + j] = false;   
                    }
                }
                answer++;
            }
            
            for(int j = 0; j < wall.length; j++){
                if(wall[j]){
                    continue;
                } 
            }
            
            if(cnt == wall.length){
                break;
            }
            
        }        
        
        return answer;
    }
}