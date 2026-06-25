import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        List<Integer> result = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        
        int baseTime = fees[0];
        int baseFee = fees[1];
        int timeCheck = fees[2];
        int feeCheck = fees[3];
        
        for(int i = 0; i < records.length; i++){
            String[] t = records[i].split(" ");
            String carNum = t[1];
            // System.out.println(Arrays.toString(t));
            
            String[] times = t[0].split(":");
            int c = Integer.parseInt(times[0]);
            int m = Integer.parseInt(times[1]);
            int time = c * 60 + m;

            map.computeIfAbsent(carNum, k -> new ArrayList<>()).add(time);
        }
        
        TreeMap<String, Integer> feeMap = new TreeMap<>();
        for(Map.Entry<String, List<Integer>> e : map.entrySet()){
            List<Integer> list = e.getValue();
            String carNum = e.getKey();
            if(list.size() % 2 != 0){
                list.add(23 * 60 + 59);
            }
            int fee = 0;
            for(int i = 0; i < list.size() - 1; i+=2){
                int temp = list.get(i + 1) - list.get(i);
                fee += temp;
            }
            feeMap.put(carNum, feeMap.getOrDefault(carNum, 0) + fee);
        }
        
        for(Map.Entry<String, Integer> e : feeMap.entrySet()){
            int totalTime = e.getValue();
            if(totalTime < baseTime){
                result.add(baseFee);
                continue;
            }
            int temp = (int)(Math.ceil((double)(totalTime - baseTime) / timeCheck));
            int totalFee = baseFee + temp * feeCheck;
            result.add(totalFee);
        }
        
        
        // map.forEach((a, b) -> System.out.println(a + ", " + b));
        // feeMap.forEach((a, b) -> System.out.println(a + ", " + b));
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}