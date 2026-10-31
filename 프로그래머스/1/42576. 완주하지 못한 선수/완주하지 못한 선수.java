import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();
        
        for(String par : participant){
            map.put(par, map.getOrDefault(par, 0) + 1);
        }
        
        for(String comp : completion){
            map.put(comp, map.get(comp) - 1);
            
            if(map.get(comp) == 0){
                map.remove(comp);
            }
        }
        
        for(var entry : map.entrySet()){
            return entry.getKey();
        }
        
        return "";
    }
}