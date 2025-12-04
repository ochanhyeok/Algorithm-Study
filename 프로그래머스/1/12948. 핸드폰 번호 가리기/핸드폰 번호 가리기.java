class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String temp = phone_number.substring(len - 4, len);
        
        for(int i = 0; i < len - 4; i++){
            answer += "*";
        }
        
        return answer + temp;
    }
}