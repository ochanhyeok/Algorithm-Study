import java.util.*;

class Solution {
    
    static int[] parent;
    
    static class Edge implements Comparable<Edge> {
        int from;
        int to;
        int cost;
        
        Edge(int from, int to, int cost){
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Edge other) {
            return this.cost - other.cost;
        }
    }
    
    static int find(int x){
        if(parent[x] == x){
            return x;
        }
        
        return parent[x] = find(parent[x]);
    }
    
    static void union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);
        
        if(rootA != rootB){
            parent[rootA] = parent[rootB];
        }
    }
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
        
        List<Edge> edges = new ArrayList<>();
        for(int[] c : costs){
            edges.add(new Edge(c[0], c[1], c[2]));
        }
        Collections.sort(edges);
        
        int edgeCount = 0;
        for(Edge e : edges){
            if(find(e.from) != find(e.to)){
                union(e.from, e.to);
                answer += e.cost;
                edgeCount++;
                if(edgeCount == n - 1){
                    break;
                }
            }
        }
        
        return answer;
    }
}