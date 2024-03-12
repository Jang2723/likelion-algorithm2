package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11047  그리디 알고리즘
public class Main11047 {
    public static void main(String[] args) throws IOException {
        // 동전의 종류 n , 합을 k로 만들기
        // 필요한 동전 개수의 최소값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        // 동전의 종류
        int n = Integer.parseInt(nk[0]);
        // 만들로자 하는 금액
        int k = Integer.parseInt(nk[1]);
        // 동전의 개별 가치
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        // 배열 제일 뒤부터 k가 나눠지는지 확인
        for (int i = n-1 ; i >=0 ; i--) {
            if (k / price[i] >= 1){
                // 나눠지면 여기서부터 카운트
                cnt += k / price[i];
                k %= price[i];

            }
        }
        System.out.println(cnt);
    }
}
