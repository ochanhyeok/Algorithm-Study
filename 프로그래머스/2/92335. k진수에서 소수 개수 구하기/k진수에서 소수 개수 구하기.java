class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        String nk = Integer.toString(n, k);    
        String[] parts = nk.split("0");
        
        for(String part : parts){
            if(part.isEmpty()){
                continue;
            }
            
            long num = Long.parseLong(part);
            if(isPrime(num)){
                answer++;
            }
        }
        
        
        return answer;
    }
    
    static boolean isPrime(long num){
        if(num == 1){
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
}