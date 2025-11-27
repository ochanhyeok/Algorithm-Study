import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> scoreList = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            // 내림차순 정렬
            Collections.sort(list, Comparator.reverseOrder());
            
            // k개 입력되기 전까지는 i번째를 list에 추가
            if(list.size() <= k){
                scoreList.add(list.get(i));
            } else {
                scoreList.add(list.get(k - 1));
            }
            
            // System.out.println(list);
            // System.out.println(scoreList);
            // System.out.println(list.size() + "---------------");
        }
        
        return scoreList.stream().mapToInt(i -> i).toArray();
    }
}