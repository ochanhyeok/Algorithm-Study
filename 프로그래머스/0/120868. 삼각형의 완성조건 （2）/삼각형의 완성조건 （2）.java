class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        // 두변중에 가장 큰변 찾기
        if(sides[0] > sides[1]){
            a = sides[0];
            b = sides[1];
        } else {
            a = sides[1];
            b = sides[0];
        }
        // a = 11, b = 7
        // 가능한 변: b + x > a
        int x = a - b + 1;
        while(x <= a){
            if(x + b > a){
                System.out.println("x: " + x);
                x++;
                answer++;  
            }
        }
        
        int y = a + b - (a + 1);
        answer += y;
        // while(a + b <= y){
        //     System.out.println("y: " + y);
        //     y++;
        // }
        
        
        
        return answer;
    }
}