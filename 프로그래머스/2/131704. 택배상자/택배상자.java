import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int idx = 0;
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 1; i <= order.length; i++){
            // 일단 스택에 저장 후 비교
            stk.push(i);
            
            // 스택에 상자가 있으면서 가장 마지막에 실은 상자가 order랑 같을 때
            while(!stk.isEmpty() && stk.peek() == order[idx]){
                stk.pop();
                answer++;
                idx++;
            }
        }
        
        return answer;
    }
}