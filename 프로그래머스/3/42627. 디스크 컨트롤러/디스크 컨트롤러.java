import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int curTime = 0;
        int totalTime = 0;
        int idx = 0;
        int cnt = 0;
        
        // 요청시간 순으로 오름차순
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        // 소요시간 순으로 오름차순
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        while(cnt < jobs.length){
            // idx가 배열길이를 넘지 않으면서 현재 시간 이하일때
            while(idx < jobs.length && jobs[idx][0] <= curTime){
                pq.offer(jobs[idx]);
                idx++;
            }
            
            // 큐가 비어있으면 다음 작업시작시간으로 점프
            if(pq.isEmpty()){
                curTime = jobs[idx][0];
                continue;
            }

            int[] job = pq.poll();
            curTime += job[1];
            totalTime += (curTime - job[0]);
            cnt++;
            
        }
        
        return totalTime / cnt;
    }
}