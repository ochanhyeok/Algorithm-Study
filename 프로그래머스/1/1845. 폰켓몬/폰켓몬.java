import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int maxPick = nums.length / 2;
        
        
        HashSet<Integer> types = new HashSet<>();
        
        for(int num : nums){
            types.add(num);
        }
        
        int typeCnt = types.size();
        
        int answer = Math.min(maxPick, typeCnt);
        
        return answer;
    }
}