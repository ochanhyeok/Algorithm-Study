class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            int temp = food[i] / 2;
            String s = String.valueOf(i);
            
            for(int j = 0; j < temp; j++){
                sb.append(s);
            }
            // System.out.println(sb);
        }

        String rev = new StringBuilder(sb).reverse().toString();
        sb.append(0).append(rev);
        
        return sb.toString();
    }
}