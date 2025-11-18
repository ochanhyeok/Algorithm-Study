import java.util.*;

class Solution {
    public int solution(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        int idx = 0;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            // Math.abs 절대치값을 활용
            int temp = Math.abs(n - arr[i]);
            if(temp < min){
                min = temp;
                idx = i;
            }
        }// 1, 1, 3, 2
        
        return arr[idx];
    }
}