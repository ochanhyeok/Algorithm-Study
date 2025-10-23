import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Queue<Integer> stock = new LinkedList<>();
        
        for(int i = 0; i < prices.length; i++){
            int time = 0;
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] <= prices[j]){
                    time++;
                }
                else{
                    time++;
                    break;
                }
            }
            
            stock.offer(time);
        }
        
        return stock.stream().mapToInt(i -> i).toArray();
    }
}