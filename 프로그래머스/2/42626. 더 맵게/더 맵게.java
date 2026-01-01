import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cnt = 0;
        
        for(Integer sco : scoville){
            pq.offer(sco);
        }
        
        
        while(pq.peek() < K){
            if(pq.size() < 2){
                return -1;
            }
            
            int first = pq.poll();
            int second = pq.poll();
            int newSco = first + (second * 2);
            
            pq.offer(newSco);
            cnt++;
        }
        
        return cnt;
    }
}