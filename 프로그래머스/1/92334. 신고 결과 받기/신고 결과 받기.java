import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        List<Integer> result = new ArrayList<>();
        Map<String, List<String>> mapId = new HashMap<>();
       
        for(int i = 0; i < report.length; i++){
            String[] temp = report[i].split(" ");
            String from = temp[0], to = temp[1];
            mapId.computeIfAbsent(to, key -> new ArrayList<>()).add(from);
        }
        
        for(int i = 0; i < id_list.length; i++){
            String name = id_list[i];
            int cnt = 0;
            
            for(Map.Entry<String, List<String>> e : mapId.entrySet()){
                List<String> list = e.getValue();
                if(list.size() >= k){
                    Set<String> set = new HashSet<>();
                    for(String n : list){
                        set.add(n);
                    }
                    
                    if(set.size() >= k){
                        for(String n : set){
                            if(n.equals(name)){
                                cnt++;
                            }
                        }
                    }
                }
            }   
            
            answer[i] = cnt;
        }
        

        return answer;
    }
}