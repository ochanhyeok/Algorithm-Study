class Solution {
    public int solution(String[] babbling) {
        int answer = 0; 
        String[] ba = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replaceAll("aya", "1")
                        .replaceAll("ye", "2")
                        .replaceAll("woo", "3")
                        .replaceAll("ma", "4");
            
            // 연속 발음이면 건너뛰기
            if(babbling[i].contains("11") || babbling[i].contains("22") || babbling[i].contains("33") || babbling[i].contains("44")){
                continue;
            }
             
            // 바꾼 발음중에 발음할 수 있는 것들만 카운트 
            if(babbling[i].matches("[1-4]+")){
                answer++;    
            }
            
            // System.out.println(babbling[i] + ", an: " + answer);
        }
        
        return answer;
    }
}