package graph.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/2667 델타 탐색
public class Main2667 {
    private static final int[] dy = {-1, 1, 0, 0};
    private static final int[] dx = {0, 0, -1, 1};
    private static int n;
    private static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] row = new int[n];
            String line = reader.readLine();
            for (int j = 0; j < n; j++) {
                char col = line.charAt(j);
                map[i][j] = col - '0';
            }
//            System.out.println(Arrays.toString(map[i]));
        }

        // 모든 집이 잇을 수 있는 지도의 칸을 반복해서 방문하는데,
            // 만약 해당하는 칸에 집이 있을 경우
            // 해당 칸을 시작점으로 BFS 또는 DFS 한다.
            // 그리고 그 과정에서 방문할 수 있었던 집의 갯수를 반환하고
            // 해당하는 킨을 방문하면서 0으로 바꿔준다.
    }

    // Y, X를 시작점으로하고 BFS를 하고 최종적으로 방문한 집의 갯수를
    // 반환하는 메서드
    private static int bfs(int y, int x) {
        return 1;
    }
}
