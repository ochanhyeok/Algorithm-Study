import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCnt = 0;   
        int result = 0;

        for(int num : array){ // map에 arr의 숫자 중복 카운트해서 저장
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int key : map.keySet()){
            int cnt = map.get(key); // 중복된 횟수
            if(cnt > maxCnt){
                maxCnt = cnt;
                result = key;
            }
        }
        
        int maxCount = 0; // 최빈값이 몇개인지 카운트하는 변수
        for(int cnt : map.values()){
            if(cnt == maxCnt){
                maxCount++;
            }
        }
        
        if(maxCount > 1){
            return -1;
        }
        
        return result;
    }
}