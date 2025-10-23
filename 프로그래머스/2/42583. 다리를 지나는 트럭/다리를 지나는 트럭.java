import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        
        // 0 세팅
        for(int i = 0; i < bridge_length; i++){
            bridge.offer(0);
        }
        
        int sum = 0;
        int time = 0;
        int idx = 0;
        
        while(idx < truck_weights.length){
            sum -= bridge.poll();
            time++;
            
            if(sum + truck_weights[idx] <= weight){
                bridge.offer(truck_weights[idx]);
                sum += truck_weights[idx];
                idx++;
            }
            else{
                bridge.offer(0);
            }
        }
        
        return time + bridge_length;
    }
}