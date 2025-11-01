import java.util.*;

class Solution {
    public int solution(int[] array) {
        int maxCnt = 0;
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : array){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int key : map.keySet()){
            int cnt = map.get(key);
            
            if(cnt > maxCnt){
                maxCnt = cnt;
                answer = key;
            }
        }
        
        int maxCount = 0;
        for(int cnt : map.values()){
            if(cnt == maxCnt){
                maxCount++;
            }
        }
    
        if(maxCount > 1){
            return -1;
        }
        
        return answer;
    }
}