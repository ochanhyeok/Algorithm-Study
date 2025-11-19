import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        TreeMap<Integer, Integer> map = new TreeMap<>(); // TreeMap은 자동정렬
        
        for(int i = 0; i < array.length; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + i);
        }
        
        answer[0] = map.lastKey();
        answer[1] = map.get(answer[0]);

        return answer;
    }
}