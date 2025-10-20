import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progressQueue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        
        // 가각의 쿠에 기능, 개발속도 저장
        for(int i = 0; i < progresses.length; i++){
            progressQueue.offer(progresses[i]);
            speedQueue.offer(speeds[i]);
        }
        
        while(!progressQueue.isEmpty()){
            // 각 기능과 속도를 꺼내서 1일치 계산
            int size = progressQueue.size();
            
            for(int i = 0; i < size; i++){
                int progress = progressQueue.poll() + speedQueue.peek();
                int speed = speedQueue.poll();
                // 하루치만큼 계산된 작업을 다시 저장, 속도도 저장
                progressQueue.offer(progress);
                speedQueue.offer(speed);
            }
            
            int cnt = 0;
            while(!progressQueue.isEmpty() && progressQueue.peek() >= 100){
                progressQueue.poll();
                speedQueue.poll();
                cnt++;
                // 100이 넘어간 작업은 배포
            }
            
            if(cnt > 0){ // 배포가 1번이상 된 경우에만 결과값에 저장
                answer.add(cnt);   
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}