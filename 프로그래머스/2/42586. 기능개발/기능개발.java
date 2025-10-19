import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progressQueue = new LinkedList<>();
        Queue<Integer> speedsQueue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            progressQueue.offer(progresses[i]);
            speedsQueue.offer(speeds[i]);
        }
        
        while(!progressQueue.isEmpty()){
            int size = progressQueue.size();
            
            for(int i = 0; i < size; i++){
                int progress = progressQueue.poll() + speedsQueue.peek();
                int speed = speedsQueue.poll();
                
                progressQueue.offer(progress);
                speedsQueue.offer(speed);
            }
            
            int cnt = 0;
            while(!progressQueue.isEmpty() && progressQueue.peek() >= 100){
                progressQueue.poll();
                speedsQueue.poll();
                cnt++;
            }
            
            if(cnt > 0){
                answer.add(cnt);   
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}