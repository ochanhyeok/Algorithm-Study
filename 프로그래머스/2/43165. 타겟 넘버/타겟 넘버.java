import java.util.*;

class Solution {
    
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    static void dfs(int[] numbers, int target, int depth, int temp){
        
        if(depth == numbers.length){
            if(temp == target){
                answer++;
            }
            return;
        }
        
        dfs(numbers, target, depth + 1, temp + numbers[depth]);
        dfs(numbers, target, depth + 1, temp - numbers[depth]);
    }
}