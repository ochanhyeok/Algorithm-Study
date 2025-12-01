class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        // s를 하나씩 체크하면서 +5 -> 그 사이에 skip문자 있으면 그만큼 +
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            char temp = ch;
            int cnt = 0;
            
            while(cnt < index){
                temp = (char)((temp + 1 - 'a') % ('z' - 'a' + 1) + 'a');
                
                if(skip.indexOf(temp) == -1){
                    cnt++;
                }
            }
            
            answer += String.valueOf(temp);
        }
        
        return answer;
    }
}