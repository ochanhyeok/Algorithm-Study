import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int lowRate = 0, hiRate = 0;
        int[] rates = new int[]{0, 6, 5, 4, 3, 2, 1};
        int ex = 0;
        
        for(int num : lottos){
            if(num == 0) ex++;
        }
        
        int correctNums = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(win_nums[i] == lottos[j]){
                    correctNums++;
                }
            }
        }
        
        if(ex == 6){
            lowRate = rates[1];
        } else {
            lowRate = rates[correctNums];
        }
        hiRate = rates[correctNums + ex];
        if(correctNums == 0 && ex == 0){
            return new int[]{rates[1], rates[1]};
        }
        
        return new int[]{hiRate, lowRate};
    }
}