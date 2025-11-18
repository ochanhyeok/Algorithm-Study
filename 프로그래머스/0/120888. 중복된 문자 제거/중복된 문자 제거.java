import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            
            if(map.containsKey(ch)){
                continue;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            answer += ch;
        }
        
        return answer;
    }
}