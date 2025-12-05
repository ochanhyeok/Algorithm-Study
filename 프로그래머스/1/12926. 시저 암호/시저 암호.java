class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isUpperCase(c)){
                char temp = (char)((c - 'A' + n ) % ('Z' - 'A' + 1) + 'A');
                answer += String.valueOf(temp);
            } else if(Character.isLowerCase(c)){
                char temp = (char)((c - 'a' + n ) % ('z' - 'a' + 1) + 'a');
                answer += String.valueOf(temp);
            } else {
                answer += " ";
            }
        }
        
        return answer;
    }
}