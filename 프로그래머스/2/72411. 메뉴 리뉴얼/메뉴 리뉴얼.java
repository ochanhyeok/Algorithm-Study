import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();
        
        for(int len : course){
            Map<String, Integer> counter = new HashMap<>();
            
            for(String order : orders){
                char[] arr = order.toCharArray();
                Arrays.sort(arr);
                makeComb(arr, 0, len, new StringBuilder(), counter);
            }
            
            answer.addAll(pickMostOrdered(counter));
        }
        Collections.sort(answer);
        
        return answer.toArray(new String[0]);
    }
    
    static void makeComb(char[] arr, int start, int k, StringBuilder cur, Map<String, Integer> counter){
        if(k == 0){
            counter.merge(cur.toString(), 1, Integer::sum);
            return;
        }
        
        for(int i = start; i < arr.length; i++){
            cur.append(arr[i]);
            makeComb(arr, i + 1, k - 1, cur, counter);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
    
    static List<String> pickMostOrdered(Map<String, Integer> counter){
        int max = counter.values().stream().max(Integer::compare).orElse(0);
        if(max < 2) return List.of();
        
        List<String> result = new ArrayList<>();
        for(var e : counter.entrySet()){
            if(e.getValue() == max){
                result.add(e.getKey());
            }
        }
        return result;
    }
}