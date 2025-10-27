import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int curTime = 0;
        int totalTime = 0;
        int cnt = 0; // 현재까지 처리한 작업의 개수
        int idx = 0;
        
        // 요청시간 기준 오름차순 정렬
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        
        // 소요시간 기준 오름차순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        while(cnt < jobs.length){
            // 현재 인덱스가 스케줄 길이보다 작으면서 현재 시간이하로 요청된 작업을 큐에 추가
            while(idx < jobs.length && jobs[idx][0] <= curTime){
                pq.offer(jobs[idx]);
                idx++;
            }
            
            // 큐가 비어있으면 다음 작업 시간으로 점프
            if(pq.isEmpty()){
                curTime = jobs[idx][0];
                continue;
            }
            
            // 큐에서 가장 짧은 작업 처리
            int[] job = pq.poll(); // 큐에서 작업 제거
            curTime += job[1];
            totalTime += (curTime - job[0]);
            cnt++;
        }
        
        int result = totalTime / jobs.length;
        
        return result;
    }
}