import java.io.*;

class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ "); // + 기준으로 split
        int xSum = 0;
        int sum = 0;
        
        for(String term : terms){
            if(term.contains("x")){ // term에 x관련 식
                if("x".equals(term)){ // 계수가 1
                    xSum += 1;
                } else{
                    String num = term.replace("x", "");
                    xSum += Integer.parseInt(num);
                }
            } else {
                sum += Integer.parseInt(term);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(xSum > 0){
            if(xSum > 1){
                sb.append(xSum);
            }
            sb.append("x");
        }
        
        if(sum > 0){
            if(xSum > 0){
                sb.append(" + ").append(sum);    
            } else{
                sb.append(sum);
            }
        }

        
        return sb.toString();
    }
}