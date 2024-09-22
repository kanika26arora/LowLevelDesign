package org.example;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {

        int N = A.length+1;

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<A.length; i++){
            int u = A[i];
            int v = B[i];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] distance = new int[N];
        Arrays.fill(distance, -1);
        Queue<Integer> pq = new LinkedList<>();

        pq.offer(0);
        distance[0] = 0;

        while(!pq.isEmpty()){

            int curr = pq.poll();

            for(int neighbor: graph.get(curr)){
                if(distance[neighbor] == -1){
                    distance[neighbor] = distance[curr]+1;
                    pq.offer(neighbor);
                }
            }
        }

        int minFuel = 0;

        for(int i=0; i<N; i++){
            int disToOffice = distance[i];
            minFuel += (int)Math.ceil((double)disToOffice/5.0);
        }

        return minFuel;

    }

    public static void main(String... s){

        int A[] = new int[]{1,1,1,9,9,9,9,7, 8};
        int B[] = new int[]{2,0,3,1,6,5,4,0,0};

        Solution solution = new Solution();
        System.out.println(solution.solution(A, B));
    }
}
