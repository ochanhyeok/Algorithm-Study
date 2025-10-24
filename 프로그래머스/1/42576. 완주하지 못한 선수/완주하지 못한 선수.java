import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> runner = new HashMap<>();
        
        for(String name : participant){
            runner.put(name, runner.getOrDefault(name, 0) + 1);
        }
        
        for(String name : completion){
            runner.put(name, runner.get(name) - 1);
        }
        
        for(String key : runner.keySet()){
            if(runner.get(key) > 0){
                return key;
            }
        }
        
        return "";
    }
}