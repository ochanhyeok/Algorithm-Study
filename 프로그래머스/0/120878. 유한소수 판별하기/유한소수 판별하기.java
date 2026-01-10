class Solution {
    public int solution(int a, int b) {

        int s = gcd(a, b);
        System.out.println(s);
        if(s != 1){
            a = a / s;
            b = b / s;
        } 

        while(true){
            if(b % 2 == 0){
                b /= 2;
            } else if(b % 5 == 0){
                b /= 5;
            } else {
                break;  
            }
        }
        
        if(b == 1){
            return 1;
        }
        
        return 2;
    }
    
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}