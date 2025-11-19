import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        // spell을 map에 넣고 dic의 각 spell이 포함되면 해당 spell value를 +1 -> 다 +1이면 return 1, 아니면 return 2
        
        for(int i = 0; i < dic.length; i++){
            // 반복문 안에서 map을 선언해서 반복문 시작할때마다 초기화
            Map<String, Integer> map = new HashMap<>();
            for(int k = 0; k < spell.length; k++){
                map.put(spell[k], 0); // map에 각 spell을 저장하고 value를 0으로 초기화
            }
            
            String[] sp = dic[i].split(""); // 각 단어를 철자별로 split
            
            for(String s : sp){
                // map에서 key를 꺼내 철자와 비교
                for(String key : map.keySet()) {
                    if(key.equals(s)){
                        map.put(key, map.getOrDefault(key, 0) + 1);
                    }
                }
                int cnt = 0;
                
                // spell이 단어에 한번씩만 포함되어 있는지 spell.length로 확인
                for(Integer value : map.values()){
                    if(value == 1){
                        cnt++;
                    }
                }
                // map.forEach((k, v) -> System.out.println(k + ", " + v));
                // System.out.println("cnt : " + cnt);
                
                if(cnt == spell.length){
                    return 1;
                }
            }
        }
        
        
            
        return 2;
    }
}