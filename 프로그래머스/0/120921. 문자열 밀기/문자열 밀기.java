import java.util.*;

class Solution {
    public int solution(String A, String B) {
        LinkedList<String> list = new LinkedList<>();
        int cnt = 0;
        
        if(A.equals(B)) return 0;
        
        for(int i = 0; i < A.length(); i++){
            list.add(String.valueOf(A.charAt(i)));
        }
        
        for(int i = 0; i < A.length(); i++){
            String s = list.removeLast();
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