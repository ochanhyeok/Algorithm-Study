import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> list = new ArrayList<>();
        List<Integer> rank = new ArrayList<>();
        
        for(int i = 0; i < emergency.length; i++){
            list.add(emergency[i]);
        }
        
        // stream sorted는 정렬만하고 원래 객체의 순서를 바꾸진 않기 떄문에 새로운 객체로 받아야함
        List<Integer> sortedList = list.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        
        for(int i = 0; i < emergency.length; i++){
            rank.add(sortedList.indexOf(emergency[i]) + 1);
        }
        
        return rank.stream().mapToInt(i -> i).toArray();
    }
}