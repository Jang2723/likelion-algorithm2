package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13305
public class Main13305 {
    public static void main(String[] args) throws IOException {
        // 도로로 이동할 때 1km마다 1리터의 기름을 사용
        // 각 도시에는 단 하나의 주유소가 있으며, 도시마다 리터당 가격은 다를 수 있다
        // 각 도시에 있는 주유소 기름 가격과 각 도시를 연결하는 도로의 길이를 입력받아
        // 최소 비용 계산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 도시의 개수
        int n = Integer.parseInt(br.readLine());

        // 거리
        long[] dist = new long[n-1];
        long[] cost = new long[n];

        // 거리 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n -1; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        // 리터당 기름값 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        // 이전 까지의 과정 중 주유 최소 비용
        long minCost = cost[0];

        for (int i = 0; i < n -1; i++) {
            // 현재 주유소가 이전 주유소 기름값보다 쌀 경우 minCost 갱신
            if (cost[i] < minCost){
                minCost = cost[i];
            }
            sum += (minCost * dist[i]);
        }

        System.out.println(sum);
    }
}
