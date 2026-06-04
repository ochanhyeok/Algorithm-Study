import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(String op : operations){
            String[] tmp = op.split(" ");
            String cmd = tmp[0];
            int num = Integer.parseInt(tmp[1]);
            
            if("I".equals(cmd)){
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else {
                if(!map.isEmpty()){
                    int key = (num == 1) ? map.lastKey() : map.firstKey();

                    // 1개면
                    if(map.get(key) == 1){
                        map.remove(key);
                    } else {
                        map.put(key, map.get(key) - 1);
                    }
                }
            }
        }
        
        if(map.isEmpty()){
            return new int[]{0, 0};
        }
        
        return new int[]{map.lastKey(), map.firstKey()};
    }
}