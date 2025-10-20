import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        int[] sorted = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(sorted);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for(int num : sorted){
            if(!map.containsKey(num)){
                map.put(num, rank++);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(map.get(num)).append(" ");
        }
        
        System.out.println(sb);
    }
}