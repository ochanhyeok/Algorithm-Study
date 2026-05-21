import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            q.add(new int[]{priorities[i], i});
        }
        
        // q.forEach((a, b) -> System.out.println(a + ", " + b));
        
        while(!q.isEmpty()){
            boolean flag = false;
            int[] cur = q.poll();
            
            
            for(int[] item : q){
                if(cur[0] < item[0]){
                    flag = true;
                }
            }
            
            if(flag){
                q.add(cur);
            } else {
                answer++;
                if(location == cur[1]){
                    return answer;
                }
            }
        }
        
        return answer;
    }
}