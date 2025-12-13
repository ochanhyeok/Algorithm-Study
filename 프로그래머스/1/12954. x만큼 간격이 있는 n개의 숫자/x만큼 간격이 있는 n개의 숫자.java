import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        long temp = x;
        
        for(long i = 0; i < n; i++){
            list.add(temp);
            temp += x;
        }
        
        return list.stream().mapToLong(i -> i).toArray();
    }
}