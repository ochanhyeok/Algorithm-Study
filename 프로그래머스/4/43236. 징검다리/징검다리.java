import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int result = 0;
        
        Arrays.sort(rocks);
        
        int left = 0;
        int right = distance;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(canRemove(rocks, mid, distance, n)){
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    static boolean canRemove(int[] rocks, int mid, int distance, int n){
        int removedCnt = 0;
        int prevRock = 0;
        
        for(int rock : rocks){
            if(rock - prevRock < mid){
                removedCnt++;
                
                if(removedCnt > n){
                    return false;
                }
            } else {
                prevRock = rock;
            }
        }
        
        if(distance - prevRock < mid){
            removedCnt++;
        }
        
        return removedCnt <= n;
    }
    
}