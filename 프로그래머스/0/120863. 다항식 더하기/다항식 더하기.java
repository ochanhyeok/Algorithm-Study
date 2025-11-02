import java.io.*;

class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ "); // 공백+로 문자열 분리
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int xSum = 0;
        
        for(String term : terms){
            if(term.contains("x")){ // 식이 x를 포함하는 식일때
                if(!term.equals("x")){ // 1보다 클때
                    String number = term.replace("x", "");
                    int num = Integer.parseInt(number);
                    xSum += num;
                } else{
                    xSum += 1;
                }
                
            } else{ // 상수일때
                int num = Integer.parseInt(term);
                sum += num;
            }
        }
        
        if(xSum > 0){
            if(xSum == 1){
                sb.append("x");
            } else{
                sb.append(xSum).append("x");
            }
        }
        
        if(sum > 0){
            if(sb.length() > 0){
                sb.append(" + ").append(sum);
            } else{
                sb.append(sum);
            }
        }
        
        return sb.toString();
    }
}