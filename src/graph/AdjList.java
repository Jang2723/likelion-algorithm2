package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AdjList {  // 인접 리스트
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        int nodes = Integer.parseInt(info[0]);
        int edges = Integer.parseInt(info[1]);
        // 인접 리스트 : 각 정점이 도달할 수 있는 정점들을 리스트로 저장하는 방식
        List<List<Integer>> adjList = new ArrayList<>();
        // 내부에 빈 리스트를 먼저 만들어준다.
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }

        // 간선의 정보를 입력받는다.
        for (int i = 0; i < edges; i++) {
            String[] edgeInfo = br.readLine().split(" ");
            int leftNode = Integer.parseInt(edgeInfo[0]);
            int rightNode = Integer.parseInt(edgeInfo[1]);
            adjList.get(leftNode).add(rightNode);
            adjList.get(rightNode).add(leftNode);
        }

        //결과를 춝력
        for (int i = 0; i < nodes; i++) {
            System.out.println(String.format("%d: %s", i, adjList.get(i)));
        }
    }
}
/*
입력 예제
정점의 개수 | 간선의 개수
8 10
0 1
0 2
0 3
1 3
1 4
2 5
3 4
4 7
5 6
6 7
 */