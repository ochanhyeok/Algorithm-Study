import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j < photo[i].length; j++){
                for(String key : map.keySet()){
                    if(key.equals(photo[i][j])){
                        sum += map.get(key);
                    }
                }
            }
            
            list.add(sum);
        }
        
        // map.forEach((k, v) -> System.out.println(k + ", " + v));
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}