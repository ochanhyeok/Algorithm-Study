import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> result = new ArrayList<>();
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int len1 = supo1.length;
        int len2 = supo2.length;
        int len3 = supo3.length;
        
        int idx = 0;
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        for(int ans : answers){
            if(ans == supo1[idx % len1]){
                cnt1++;
            }
            if(ans == supo2[idx % len2]){
                cnt2++;
            }
            if(ans == supo3[idx % len3]){
                cnt3++;
            }
            idx++;
        }
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));
        
        if(cnt1 == max) result.add(1);
        if(cnt2 == max) result.add(2);
        if(cnt3 == max) result.add(3);
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}