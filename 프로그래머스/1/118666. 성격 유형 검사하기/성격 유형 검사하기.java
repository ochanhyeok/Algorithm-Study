import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map1 = new LinkedHashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>();
        Map<Integer, Integer> cho = new HashMap<>();
        
        cho.put(1, 3);
        cho.put(2, 2);
        cho.put(3, 1);
        cho.put(4, 0);
        cho.put(5, 1);
        cho.put(6, 2);
        cho.put(7, 3);
        
        map1.put("R", 0);
        map1.put("C", 0);
        map1.put("J", 0);
        map1.put("A", 0);
        
        map2.put("T", 0);
        map2.put("F", 0);
        map2.put("M", 0);
        map2.put("N", 0);
        
        
        for(int i = 0; i < survey.length; i++){
            String[] temp = survey[i].split("");
            // Arrays.sort(temp); 직접 정렬하고 순서 바뀌면 choice도 반대로
            
            if(temp[0].charAt(0) > temp[1].charAt(0)){
                String s = temp[0];
                temp[0] = temp[1];
                temp[1] = s;
                choices[i] = 8 - choices[i];
            }
            
            // System.out.println(Arrays.toString(temp) + ", choice: " + choices[i] + ", sco: " + cho.get(choices[i]));
            
            // 왼쪽 선택한 경우
            if(choices[i] >= 1 && choices[i] <= 3){
                map1.put(temp[0], map1.getOrDefault(temp[0], 0) + cho.get(choices[i]));

            } else if(choices[i] >= 3 && choices[i] <= 7){ // 오른쪽 선택한 경우
                map2.put(temp[1], map2.getOrDefault(temp[1], 0) + cho.get(choices[i]));
            }
        }
        
        // map1.forEach((k, v) -> System.out.println(k + ", " + v));
        // map2.forEach((k, v) -> System.out.println(k + ", " + v));
            
        // map1 map2를 Map.Entry로 값 비교하기위해 리스트에 삽입
        
        List<Map.Entry<String, Integer>> entries1 = new ArrayList<>(map1.entrySet());
        List<Map.Entry<String, Integer>> entries2 = new ArrayList<>(map2.entrySet());
        
        for(int i = 0; i < entries1.size(); i++){
            Map.Entry<String, Integer> entry1 = entries1.get(i);
            Map.Entry<String, Integer> entry2 = entries2.get(i);
            int v1 = entry1.getValue();
            int v2 = entry2.getValue();
            
            if(v1 >= v2){
                answer += entry1.getKey();
            } else {
                answer += entry2.getKey();
            }
        }
        
        return answer;
    }
}