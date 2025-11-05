import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] poly = quiz[i].split(" ");
            int[] nums = new int[poly.length - 2];
            // String[] operator = new String[poly.length];
            int idx = 0;
            
            // 공백기준으로 split한 poly 탐색 (= 전까지)
            for(int j = 0; j < poly.length - 2; j++){
                // 연산자일경우
                if("-".equals(poly[j]) || "+".equals(poly[j])){
                    int num = Integer.parseInt(poly[j + 1]);
                    if("-".equals(poly[j])){
                        nums[idx] = num * -1;
                    } else{
                        nums[idx] = num;
                    }
                    j++;
                } else { // 숫자일경우
                    int num = Integer.parseInt(poly[j]);
                    nums[idx] = num;
                }
                idx++;
            }
            
            int sum = 0;
            for(int j = 0; j < idx; j++){
                sum += nums[j];
            }
            
            int result = Integer.parseInt(poly[poly.length - 1]);
            if(sum == result){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
         
        return answer;
    }
}