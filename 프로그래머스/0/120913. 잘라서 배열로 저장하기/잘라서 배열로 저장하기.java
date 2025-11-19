import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        String str = "";
        
        for(int i = 0; i < my_str.length(); i++){
            str += String.valueOf(my_str.charAt(i));
            if((i + 1) % n == 0){
                list.add(str);
                // System.out.println(str);
                str = "";
            }
        }
        
        if(!"".equals(str)){
            list.add(str);   
        }
        
        return list.stream().toArray(String[]::new);
    }
}