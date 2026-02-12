import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Long> result = new ArrayList<>();
        
        for(long num = n; num > 0; num/=10){
            long number = num % 10;
            result.add(number);
        }
        
        System.out.println(result);
        
        return result.stream().mapToInt(Long::intValue).toArray();
    }
}