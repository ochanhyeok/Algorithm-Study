import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] scores = new int[score.length];
        int[] result = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            scores[i] = score[i][0] + score[i][1];
            list.add(scores[i]);
        }
        
        list.sort(Comparator.reverseOrder()); // 내림차순
        
        for(int i = 0; i < scores.length; i++){
            // 합산한 점수의 인덱스가 내림차순한 list에서 몇번째인지
            // indexOf는 첫인덱스 값만 찾기 때문에 중복이여도 인덱스는 같음
            result[i] = list.indexOf(scores[i]) + 1;
        }
        
        return result;
    }
}