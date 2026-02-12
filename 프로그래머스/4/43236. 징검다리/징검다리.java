import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int result = 0;
        
        Arrays.sort(rocks);
        
        int left = 0;
        int right = distance;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(canRemove(rocks, mid, n, distance)){
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    static boolean canRemove(int[] rocks, int mid, int n, int distance){
        int removed = 0;
        int prev = 0;
        
        for(int rock : rocks){
            if(rock - prev < mid){
                removed++;
            } else {
                prev = rock;
            }
        }
        
        if(distance - prev < mid){
            removed++;
        }
        
        return removed <= n;
    }
}