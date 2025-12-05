import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        for(int i = n; i > 0; i /= 10){
            int num = i % 10;
            sum += num;
        }
        System.out.println(sum);

        return sum;
    }
}