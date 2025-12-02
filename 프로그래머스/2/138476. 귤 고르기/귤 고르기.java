import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int i = 0; i < tangerine.length; i++){
            int n = tangerine[i];
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> sortedList = map.entrySet().stream().sorted((e1, e2) -> e2.getValue() - e1.getValue()).collect(Collectors.toList());
        
        //sortedList.forEach(entry -> System.out.println(entry.getKey() + ", " + entry.getValue()));
        
        
        for(Map.Entry<Integer, Integer> entry : sortedList){
            int size = entry.getKey();
            int cnt = entry.getValue();
            
            k -= cnt;            
            answer++;
            
            if(k <= 0){
                break;
            }
        }
        
        return answer;
    }
}