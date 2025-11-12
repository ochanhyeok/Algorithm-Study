class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = age; i > 0; i/=10){
            int n = i % 10;
            // System.out.println(n);
            
            char s = (char)('a' + n);
            sb.append(s);
            // System.out.println(s);
        }
        sb.reverse();
        
        return sb.toString();
    }
}