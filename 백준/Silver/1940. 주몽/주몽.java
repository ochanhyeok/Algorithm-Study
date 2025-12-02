import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        
        Arrays.sort(arr);
        
        while(leftIdx < rightIdx){
            int sum = arr[leftIdx] + arr[rightIdx];
            
            if(sum == M){
                cnt++;
                leftIdx++;
                rightIdx--;
            }
            // 1, 2, 3, 4, 5, 7
            else if(sum < M){
                leftIdx++;
            } else {
                rightIdx--;
            }
        }
        
        System.out.println(cnt);
    }
}