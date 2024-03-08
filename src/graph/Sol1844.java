package graph;

import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/1844
public class Sol1844 {
    private static int n;
    private static int m;
    private static final int[] dy = {-1 , 1, 0, 0};
    private static final int[] dx = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int answer = -1 ;

        n = maps.length;
        m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> toVisit = new LinkedList<>();
        // 첫 칸은 항상 0,0 첫 칸도 움직인걸로 판단
        toVisit.offer(new int[]{0, 0, 1});

        while(!toVisit.isEmpty()) {
            // 현재 위치로 방문한다.
            int[] now = toVisit.poll();
            int nowY = now[0];
            int nowX = now[1];
            // 다른 방향에서 온적 있다면 아무작업도 하지 않는다.
            if (visited[nowY][nowX])
                continue;
            visited[nowY][nowX] = true;

            int steps = now[2];
            // 우 하단에 도착했다면 기록하고 중단한다.
            if (nowY == n-1 && nowX == m-1) {
                answer = steps;
                break;
            }

            for (int i = 0; i < 4; i++) {
                // 다음에 방문할 곳은 (nextY, nextX)
                int nextY = nowY + dy[i];
                int nextX = nowX + dx[i];
                if (
                    // 미로의 영역 내부에 있는지?
                    checkBounds(nextY,nextX) &&
                    // 벽이 없거나 도착지점 (이동 가능한 칸) 인지?
                    (maps[nextY][nextX] == 1) &&
                    // 아직 방문하지 않았는지?
                    !visited[nextY][nextX]
                )
                    toVisit.add(new int[]{nextY, nextX, steps + 1});
            }
        }
        return answer;
    }
    // 미로의 영역 내부에 있는지?
    private static boolean checkBounds(int y, int x) {
        return
                -1 < x && x < m  &&
                -1 < y && y < n;
    }
}

/*
n x m 크기의 게임 맵
캐릭터는 첫줄 제일 왼쪽칸
상대방 진영은 게임 맵의 우측 하단인 (n, m) 위치
*/