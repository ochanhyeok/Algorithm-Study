class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[a-zA-Z]", " ");
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].isEmpty()){
                // System.out.println(arr[i]);
                answer += Integer.parseInt(arr[i]);   
            }
        }
        // System.out.println("str: " + str);
        
        return answer;
    }
}