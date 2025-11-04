import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] scores = new int[score.length];
        int[] result = new int[score.length];
        int idx = 0;
        
        for(int i = 0; i < score.length; i++){
            // double avg = (score[i][0] + score[i][1]) / 2;
            int sum = score[i][0] + score[i][1];
            list.add(sum);
            scores[idx++] = sum;
        }
        
        list.sort(Comparator.reverseOrder()); // 내림차순
        
        for(int i = 0; i < idx; i++){
            result[i] = list.indexOf(scores[i]) + 1;
        }
        
        return result;
    }
}