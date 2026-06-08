import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        int idx = 0;
        
        for(String rec : record){
            String[] cmd = rec.split(" ");
            
            if("Enter".equals(cmd[0])){
                map.put(cmd[1], cmd[2]);
                idx++;
            } else if("Leave".equals(cmd[0])){
                idx++;
            } else {
                map.put(cmd[1], cmd[2]);
            }
        }
        
        String[] answer = new String[idx];
        idx = 0;
        for(String rec : record){
            String[] cmd = rec.split(" ");
            if("Enter".equals(cmd[0])){
                answer[idx++] = map.get(cmd[1]) + "님이 들어왔습니다.";
            } else if("Leave".equals(cmd[0])){
                answer[idx++] = map.get(cmd[1]) + "님이 나갔습니다.";
            }
        }
        
        return answer;
    }
}