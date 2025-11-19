import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int idx = 1;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 1; i <= 200; i++){
            boolean flag = false;
            // for(int j = i; j > 0; j/=10){
            //     int num = j % 10;
            //     if(num == 3){
            //         flag = true;
            //         break;
            //     }
            // }
            
            String str = "" + i;
            if(str.contains("3")){
                flag = true;
            }
            
            if(!flag){
                if(i % 3 != 0){
                    map.put(idx++, i);
                    // System.out.println(i);
                }   
            }
        }
        
        return map.get(n);
    }
}