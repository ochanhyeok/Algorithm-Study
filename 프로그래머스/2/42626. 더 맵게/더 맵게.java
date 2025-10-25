import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        boolean flag = false;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 오름차순
        
        
        for(int i = 0; i < scoville.length; i++){
            pq.offer(scoville[i]);
        }
        
        
        while(pq.peek() < K){ // 가장 작은 소코빌 지수가 K보다 크면 반복문 종료
            if(pq.size() < 2){
                return -1;
            }
            
            int minSco = pq.poll();
            int minSco2 = pq.poll();

            int newSco = minSco + (minSco2 * 2);

            pq.offer(newSco);
            cnt++;
        }        
        
        return cnt;
    }
}