class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        
        // 공백이 1개 이상이라고해서 사이에 2개가 올수도 있기 때문에
        // split으로하면 예외케이스가 생김
        for(int i = 0; i < s.length(); i++){
            
            String str = String.valueOf(s.charAt(i));
            if(" ".equals(str)){
                idx = 0;
                answer += " ";
                continue;   
            }
            
            if(idx % 2 == 0){
                str = str.toUpperCase();
            } else {
                str = str.toLowerCase();
            }
            
            answer += str;
            idx++;
        }
        
        return answer;
    }
}