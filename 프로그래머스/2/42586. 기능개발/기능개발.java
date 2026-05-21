import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> progressQ = new LinkedList<>();
        Queue<Integer> speedQ = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
            progressQ.add(progresses[i]);
            speedQ.add(speeds[i]);
        }
        
        while(!progressQ.isEmpty()){
            int size = progressQ.size();
            
            for(int i = 0; i < size; i++){
                int curP = progressQ.poll() + speedQ.peek();
                progressQ.add(curP);
                speedQ.add(speedQ.poll());
            }
            
            int cnt = 0;
            while(!progressQ.isEmpty() && progressQ.peek() >= 100){
                progressQ.poll();
                speedQ.poll();
                cnt++;
            }
            
            if(cnt > 0){
                result.add(cnt);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}