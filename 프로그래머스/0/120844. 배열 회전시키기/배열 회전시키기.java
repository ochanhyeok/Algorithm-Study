import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int num : numbers){
            dq.add(num);
        }
        
        if("left".equals(direction)) {
            int n = dq.removeFirst();
            dq.addLast(n); 
        } else {
            int n = dq.removeLast();
            dq.addFirst(n);
        }
        
        return dq.stream().mapToInt(i -> i).toArray();
    }
}