class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");
        
        for(int i = 0; i < s; i++){
            sb.append(String.valueOf(arr[i]));
        }
        sb.append(overwrite_string);
        for(int i = s + overwrite_string.length(); i < my_string.length(); i++){
            sb.append(String.valueOf(arr[i]));
        }
        
        
        return sb.toString();
    }
}