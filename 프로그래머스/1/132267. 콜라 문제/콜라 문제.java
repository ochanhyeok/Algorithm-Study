class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int total = n;
        
        while(n >= a){
            int temp = a * (n / a); // 마트에 가져갈 수 있는 콜라의 최대 갯수
            n = n - temp; // 남은 콜라
            
            // 받을 수 있는 콜라갯수 계산
            int receiveCoke = (temp / a) * b;
            n += receiveCoke; // 받은 콜라 더함
            System.out.println("temp: " + temp + ", n: " + n + ", reC: " + receiveCoke);
            
            answer += receiveCoke;
            System.out.println("ans :" + answer);
        }
        
        
        return answer;
    }
}