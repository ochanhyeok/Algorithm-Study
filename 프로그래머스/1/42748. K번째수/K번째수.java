import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++){
            int idx = 0;
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++){
                arr[idx++] = array[j];
            }
            Arrays.sort(arr);
            
            list.add(arr[commands[i][2] - 1]);
            // System.out.println(Arrays.toString(arr) + ", " + arr[commands[i][2] - 1]);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}