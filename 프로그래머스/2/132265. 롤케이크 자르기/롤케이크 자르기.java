import java.util.*;

class Solution {
    
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < topping.length; i++){
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }
        
        // map.forEach((a, b) -> System.out.println(a + ", " + b));
        
        for(int i = 0; i < topping.length; i++){
            int top = topping[i];
            map.put(top, map.get(top) - 1);
            set.add(top);
            if(map.get(top) == 0){
                map.remove(top);
            }
            if(map.size() == set.size()){
                answer++;
            }
        }
        
        return answer;
    }
}