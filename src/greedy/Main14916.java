package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14916  그리디 알고리즘
public class Main14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2, 5원짜리 동전으로만 최소의 갯수가 되오록
        int n = Integer.parseInt(br.readLine());
        // 거슬러줄 수 없는 경우
        if (n == 1 || n == 3) System.out.println(-1);
        // 5원으로 다 거슬러 주면 짝수 금액이 남는 경우
        else if ( (n % 5) % 2 == 0) {
            // 5짜리로 쓸 수 있는 만큼
            int fives = n / 5;
            // 남은걸 2로
            int twos = (n % 5) / 2;
            System.out.println(fives + twos);
        }
        // 5원으로 다 거슬러 주면 홀수 금액이 남는 경우
        else {
            int fives = n / 5 - 1 ;
            int twos = ((n % 5) + 5 ) / 2;
            System.out.println(fives + twos);
        }
    }
}
