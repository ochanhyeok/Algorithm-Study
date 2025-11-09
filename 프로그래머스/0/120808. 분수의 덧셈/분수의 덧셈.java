class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int n = lcm(denom1, denom2);
        
        int d1 = n / denom1;
        int d2 = n / denom2;
        // System.out.println("gcd: " + n);
        // System.out.println(d1 + ", " + d2);
        
        int num = numer1 * d1 + numer2 * d2;
        
        int gcdValue = gcd(num, n);
        
        answer[0] = num / gcdValue;
        answer[1] = n / gcdValue;
        
        return answer;
    }
    
    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}