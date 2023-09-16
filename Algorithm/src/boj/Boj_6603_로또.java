package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_6603_로또 {

	static int k;
	static int[] lotto;
	static int[] res = new int[6];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while (true) {

			st = new StringTokenizer(br.readLine());

			k = Integer.parseInt(st.nextToken());
			
			if (k == 0) // 입력이 0이면 루프 종료
				break;

			lotto = new int[k]; // 로또숫자들을 담아줄 배열

			for (int i = 0; i < k; i++) {
				lotto[i] = Integer.parseInt(st.nextToken());
			}

			combi(0, 0);
			System.out.println();

		}
	}// main

	// lotto의 배열의 인덱스 n
	// res의 인덱스 r
	public static void combi(int n, int r) {

		if (r == 6) {
//			System.out.println(Arrays.toString(res));
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
			return;
		}
		if (n == k) {
			return;
		}

		// 재귀
		res[r] = lotto[n];
		combi(n + 1, r + 1);
		combi(n + 1, r);

	}// combi

}
