import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        Map<String, String> map = new HashMap<>();
        
        for(int i = 0; i < db.length; i++){
            map.put(db[i][0], db[i][1]);
        }
        
        //map.forEach((k, v) -> System.out.println(k + ", " + v));
        
        for(String key : map.keySet()){
            if(id_pw[0].equals(key)){
                if(id_pw[1].equals(map.get(key))){
                    return "login";
                }
                return "wrong pw";
            }   
        }
        
        return "fail";
    }
}