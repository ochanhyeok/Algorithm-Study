import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new TreeMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        boolean flag = false;
        for(Character c : map.keySet()){
            if(map.get(c) == 1){
                flag = true;
                sb.append(String.valueOf(c));
            }
        }
        
        if(flag){
            return sb.toString();
        } else {
            return "";   
        }
    }
}