import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // arr 값 추출 -> list -> 정렬
        List<Integer> result = new ArrayList<>();
        
        for(int num : arr){
            if(num % divisor == 0){
                result.add(num);
            }
        }
        
        result.sort((a, b) -> a.compareTo(b));
        
        if(result.size() < 1) {
            return new int[]{-1};
        }
        
    
        return result.stream().mapToInt(i -> i).toArray();   
    }
}