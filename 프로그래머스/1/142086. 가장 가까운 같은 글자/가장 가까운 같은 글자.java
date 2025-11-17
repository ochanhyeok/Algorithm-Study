import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.split("");
        List<Integer> list = new LinkedList<>();
        
        list.add(-1);
        for(int i = 1; i < arr.length; i++){
            int idx = -1;
            for(int j = 0; j < i; j++){
                if(arr[i].equals(arr[j])){
                    idx = j;
                }
            }
            
            if(idx == -1){
                list.add(-1);
            } else {
                list.add(i - idx);
            }
        }
        
        System.out.println(list);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}