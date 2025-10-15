import java.io.*;
import java.util.*;
public class Main{

    static ArrayList<Integer>[] graph; // 그래프
    static boolean[] visited; // 방문 체크
    static int cnt = 0; // 감염된 컴퓨터

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        // DFS(깊이 우선 탐색)
        /*
        접근방법
        1. 그래프 구성
          - 컴퓨터 간의 연결 정보를 인접리스트 또는 인접행렬로 저장
        2. DFS 탐색
          - 1번 컴퓨터에서 시작
          - 연결된 모든 컴퓨터를 방문하면서 카운트
        3. 결과 출력
          - 감염된 컴퓨터 수 = 전체 방문한 컴퓨터 수 - 1 (1번 제외)
        */

        // 그래프 초기화
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        // 각 인덱스에 새로운 ArrayList 생성
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }

        // 연결정보 입력
        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 양방향 연결
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1); // 1번부터 탐색시작

        System.out.println(cnt - 1);

    }

    static void dfs(int comp){
        visited[comp] = true;
        cnt++;

        for(int next : graph[comp]){
            if(!visited[next]){
                dfs(next); // 재귀
            }
        }
    }
}