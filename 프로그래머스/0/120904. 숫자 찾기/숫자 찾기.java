class Solution {
    public int solution(int num, int k) {
        String n = String.valueOf(num);
        String[] arr = n.split("");
        String t = String.valueOf(k);
        
        for(int i = 0; i < arr.length; i++){
            if(t.equals(arr[i])){
                return i + 1;
            }
        }
        
        return -1;
    }
}