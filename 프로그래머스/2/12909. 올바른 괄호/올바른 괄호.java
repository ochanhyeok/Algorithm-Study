import java.util.*;

class Solution {
    boolean solution(String s) {

        Stack<Character> stk = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){
                stk.push(c);
            }
            else{
                // 닫는 괄혼데 스택이 비어있으면 false 반환
                if(stk.isEmpty()){
                    return false;
                }
                stk.pop();
            }
        }

        return stk.isEmpty(); // 만약 여는 괄호가 남아있으면
    }
}