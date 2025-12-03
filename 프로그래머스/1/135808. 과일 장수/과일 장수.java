import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int price = 0;
        
        // 내림차순 정렬
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        // System.out.println(Arrays.toString(arr));
        
        // 사과의 최대 점수 = 최저사과 점수 * k * 상자의 갯수
        int idx = m - 1;
        while(idx < arr.length){
            price += arr[idx] * m;
            // System.out.println("idx: " + idx + ", price: " + price);
            idx += m;
        }
        
        return price;
    }
}