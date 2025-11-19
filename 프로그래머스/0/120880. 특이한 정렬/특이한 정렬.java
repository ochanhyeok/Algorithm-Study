import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int num : numlist){
            map.put(num, map.getOrDefault(num, 0) + Math.abs(n - num));
        }    
        
        // map.forEach((k, v) -> System.out.println(k + ", " + v));
        // System.out.println();
        
        map.entrySet().stream()
            .sorted((e1, e2) -> {
                if(e1.getValue().equals(e2.getValue())){
                    return e2.getKey() - e1.getKey();
                }
                return e1.getValue() - e2.getValue();
            })
            .forEach(entry -> list.add(entry.getKey()));
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}