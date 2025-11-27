import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        // 각 문자열 split후 배열에 저장
        String[] arr = s.split("");
        
        String x = arr[0];
        int xCnt = 0;
        int yCnt = 0;
        String st = "";
        for(int i = 0; i < arr.length; i++){
            if(x.equals(arr[i])){
                xCnt++;
            } else {
                yCnt++;
            }
            st += arr[i];
            // 두 횟수가 같아지면 분리후 다시 시작
            if(xCnt == yCnt){
                answer++;
                
                if(i + 1 < arr.length){
                    x = arr[i + 1];
                }
            
                xCnt = 0;
                yCnt = 0;
                System.out.println(st);
                st = "";
            }
        }
        
        if(xCnt > 0 || yCnt > 0){
            answer++;
        }
    
        
        
        return answer;
    }
}