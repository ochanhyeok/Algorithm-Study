import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int cnt = 0;
        LinkedList<String> list = new LinkedList<>();
        
        if(A.equals(B)){ // 두개의 문자열이 이미 같다면
            return 0;
        }
        
        for(int i = 0; i < A.length(); i++){
            String ch = String.valueOf(A.charAt(i));
            list.add(ch);
        }
        
        for(int i = 0; i < A.length(); i++){
            String s = list.remove(A.length() - 1);
            list.addFirst(s);
            cnt++;
            StringBuilder sb = new StringBuilder();
            for(String st : list){
                sb.append(st);
            }
            String str = sb.toString();
            
            if(str.equals(B)){
                return cnt;
            }
        }
        
        return -1;
    }
}