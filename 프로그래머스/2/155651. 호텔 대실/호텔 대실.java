import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int n = book_time.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[][] times = new int[n][2];
        
        for(int i = 0; i < n; i++){
            String[] st1 = book_time[i][0].split(":");
            String[] st2 = book_time[i][1].split(":");
            
            int startTime = Integer.parseInt(st1[0]) * 60 + Integer.parseInt(st1[1]);
            int endTime = Integer.parseInt(st2[0]) * 60 + Integer.parseInt(st2[1]) + 10;
            times[i][0] = startTime;
            times[i][1] = endTime;
        }
        
        Arrays.sort(times, (a, b) -> a[0] - b[0]);
        
        for(int i = 0; i < n; i++){
            if(!pq.isEmpty() && pq.peek() <= times[i][0]){
                pq.poll();
            }    
            pq.offer(times[i][1]);
        }
        
        return pq.size();
    }
}