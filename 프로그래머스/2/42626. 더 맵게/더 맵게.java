import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int sco : scoville){
            pq.offer(sco);
        }
        
        while(!pq.isEmpty() && pq.peek() < K){
            if(pq.size() < 2){
                return -1;
            }
            
            int totalSco = pq.poll() + pq.poll() * 2;
            pq.offer(totalSco);
            answer++;
        }
        
        
        return answer;
    }
}