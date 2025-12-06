class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = s.charAt(0);
        
        if(c == '-'){
            String num = s.substring(1, s.length());
            answer = Integer.parseInt(num) * -1;
        } else if(c == '+'){
            String num = s.substring(1, s.length());            
            answer = Integer.parseInt(num);
        } else {
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}