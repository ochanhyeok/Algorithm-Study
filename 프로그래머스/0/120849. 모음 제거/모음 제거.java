import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("a|e|i|o|u");
        
        return String.join("", str);
    }
}