class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        // Integer나 int 쓰면 범위 초과해서 런타임에러
        // Long 써야함
        long pnum = Long.parseLong(p);
        int plen = p.length();
        int tlen = t.length();
        
        for(int i = 0; i <= tlen - plen; i++){
            String str = t.substring(i, i + plen);
            // System.out.println(str);
            long n = Long.parseLong(str);
            
            if(n <= pnum){
                answer++;
            }
        }
        
        return answer;
    }
}