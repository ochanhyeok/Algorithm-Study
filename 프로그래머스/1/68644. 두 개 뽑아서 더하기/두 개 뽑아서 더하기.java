import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        
        // 키 기준 오름차순 정렬
        List<Map.Entry<Integer, Integer>> sortedList = map.entrySet().stream()
                .sorted((e1, e2) -> e1.getKey() - e2.getKey())
                .collect(Collectors.toList());
        
        sortedList.forEach(entry -> System.out.println(entry.getKey() + ", " + entry.getValue()));
        answer = new int[sortedList.size()];
        for(Map.Entry<Integer, Integer> entry : sortedList){
            int key = entry.getKey();
            answer[idx++] = key;
        }
        
        return answer;
    }
}