class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for(int i = arr.length - 1; i >= my_string.length() - n; i--){
            answer += arr[i];
        }
        
        return new StringBuilder(answer).reverse().toString();
    }
}