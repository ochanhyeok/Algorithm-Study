import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int idx = 2;
        
        // 소인수 구하고 마지막에 나머지가 소수면 추가
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                list.add(i);
                n /= i;
            }
        }
        
        if(n > 1){
            list.add(n);
        }
        
        Collections.sort(list);
        List<Integer> deduped = list.stream().distinct().collect(Collectors.toList());
        
        return deduped.stream().mapToInt(i -> i).toArray();
    }
}