import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[a-z]", "");
        String[] arr = str.split("");
        List<Integer> list = new LinkedList<>();

        for(String s : arr){
            list.add(Integer.parseInt(s));
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}