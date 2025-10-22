import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int sum = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++){
            bridge.offer(0);
        }
        
        int idx = 0;
        
        while(idx < truck_weights.length){
            sum -= bridge.poll();
            time++;
            
            // 새트럭이 올라갈 수 있는지 확인
            if(truck_weights[idx] + sum <= weight){
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