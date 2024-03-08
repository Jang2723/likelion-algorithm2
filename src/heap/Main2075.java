package heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// https://www.acmicpc.net/problem/2075 우선순위 큐
public class Main2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 최소값이 우선적으로 나오는 우선순위 큐
        PriorityQueue<Integer> que = new PriorityQueue<>();
        // 숫자를 입력받는다.
        for (int i = 0; i < n; i++) {
            String[] lineNums = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                // 숫자를 우선순위 큐에 넣어준다.
                que.offer(Integer.parseInt(lineNums[j]));
                // 우선순위 큐의 크기가 n보다 커지면
                if (que.size() > n) {
                    // 하나 뺴서 n 개로 유지
                    que.poll();
                }
            }
        }
        System.out.println(que.peek());
    }
}
