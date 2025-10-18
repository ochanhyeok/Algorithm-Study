import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 첫번째 원소는 무조건 추가
        list.add(arr[0]);
        
        // 두번째 원소부터 비교
        for(int i = 1; i < arr.length; i++){
            // 이전 원소와 다르면 추가
            if(arr[i] != arr[i - 1]){
                list.add(arr[i]);
            }
        }

        
        return list.stream().mapToInt(i -> i).toArray();
    }
}