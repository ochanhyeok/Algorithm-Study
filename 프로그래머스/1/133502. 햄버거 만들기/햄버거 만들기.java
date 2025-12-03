import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        
        for(int n : ingredient){
            stk.push(n);
            
            // 하나씩 추가하고 길이가 4 이상부터 뒤에서 4개씩 체크
            if(stk.size() >= 4){
                // 사이즈를 변수에 저장 if안에서 size()함수를 쓰면 삭제하면서 사이즈가 변경되기 때문에 오류남
                int size = stk.size();

                if(stk.get(size - 4) == 1 && stk.get(size - 3) == 2 && stk.get(size - 2) == 3 && stk.get(size - 1) == 1){
                    stk.pop();
                    stk.pop();
                    stk.pop();
                    stk.pop();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}