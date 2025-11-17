import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 내림차순
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : numbers){
            pq.add(num);
        }
        
        int a = pq.poll();
        int b = pq.poll();
        
        answer = a * b;
        
        return answer;
    }
}