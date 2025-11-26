import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        //list에 다 넣고나서 앞에서부터 goal이랑 비교하면서 하나씩 삭제
        // goal에 해당차례 키워드가 cards1, cards2의 맨앞에 없으면 return NO
        List<String> listCard1 = new ArrayList<>();
        List<String> listCard2 = new ArrayList<>();
        List<String> goals = new ArrayList<>();
        
        for(int i = 0; i < cards1.length; i++){
            listCard1.add(cards1[i]);
        }
        for(int i = 0; i < cards2.length; i++){
            listCard2.add(cards2[i]);
        }
        
        // goal이랑 비교
        for(int i = 0; i < goal.length; i++){
            String card1 = "";
            String card2 = "";
            if(!listCard1.isEmpty()){
                card1 = listCard1.get(0);   
            }
            if(!listCard2.isEmpty()){
                card2 = listCard2.get(0);
            }
            // System.out.println(card1);
            
            if(goal[i].equals(card1)){
                listCard1.remove(0);
            } else if(goal[i].equals(card2)){
                listCard2.remove(0);
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}