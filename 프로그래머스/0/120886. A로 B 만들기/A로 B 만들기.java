import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] beArr = before.split("");
        Map<String, Integer> map = new HashMap<>();
        
        // after를 map에 저장하고 before를 split후 after랑 비교하면서 같은 spell이면 +1 -> map의 value갑슫ㄹ이 다 1로 채워지면 1반환
        for(int i = 0; i < after.length(); i++){
            String s = String.valueOf(after.charAt(i));
            map.put(s, map.getOrDefault(s, 0) + 1); // after에서 spell에 갯수만큼 저장
        }
        
        for(int i = 0; i < beArr.length; i++){
            for(String key : map.keySet()){
                if(key.equals(beArr[i])){
                    map.put(key, map.getOrDefault(key, 0) - 1); // before의 spell이 map에 저장되어있으면 -1
                }
            }
        }
        
        // value중에 0이 아닌게 있으면 0반환
        for(Integer v : map.values()){
            if(v != 0){
                return 0;
            }
        }
        
        // map.forEach((k, v) -> System.out.println(k + ", " + v));
        
        return 1;
    }
}