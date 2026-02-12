import java.util.*;
import java.util.stream.*;

class Solution { // int -> String -> sort
    public String solution(int[] numbers) {
        List<String> result = new ArrayList<>();
        
        for(int num : numbers){
            result.add(String.valueOf(num));
        }
        
        result.sort((a, b) -> (b + a).compareTo(a + b));
        
        if("0".equals(result.get(0))){
            return "0";
        }
        
        return result.stream().collect(Collectors.joining());
    }
}