import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[a-zA-z]", "");
        String[] arr = str.split("");
        
        for(String s : arr){
            answer += Integer.parseInt(s);
        }
        
        
        return answer;
    }
}