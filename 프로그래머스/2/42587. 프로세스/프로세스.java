import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        int answer = 0;
        
        // 큐에 중요도, 현재 인덱스 삽입
        for(int i = 0; i < priorities.length; i++){
            queue.add(new int[]{priorities[i], i});
        }
        
        while(!queue.isEmpty()){
            int cur[] = queue.poll();
            
            boolean hasHighPriority = false;
            for(int[] item : queue){
                if(cur[0] < item[0]){ // 큐에있는 우선순위 비교
                    hasHighPriority = true;
                    break;
                }
            }
            
            if(hasHighPriority){ // cur보다 큰 우선순위가 있으면 cur다시 삽입
                queue.add(cur);
            }
            else{ // cur의 우선순위가 가장 크다면
                answer++;
                if(location == cur[1]){ // 찾는 위치가 인덱스와 같으면
                    return answer;
                }
            }
        }
        return answer;
    }
}