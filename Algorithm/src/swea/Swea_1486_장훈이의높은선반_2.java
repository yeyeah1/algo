package swea;

import java.util.Scanner;

public class Swea_1486_장훈이의높은선반_2 {

	static int N, B, ans; // N: 점원의 수, B : 선반의 높이 1 ~ 모든점원키의합
	static int[] H; // 점원들의 키 배열
	static boolean[] sel; // 해당 점원 탑 사용 유무

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			N = sc.nextInt();
			B = sc.nextInt();
			H = new int[N];
			sel = new boolean[N];

			for (int i = 0; i < N; i++) {
				H[i] = sc.nextInt();
			} // 입력 끝
				/////////////////////////////////////////

//			ans = Integer.MAX_VALUE;
			ans = 987654321; // 이런식으로 선언해줘도 됨. 최솟값 구해야하니까
			// 많이 큰 수로 정해놓으면 됨!
			powerset(0);
			System.out.println("#" + tc + " " + (ans - B));

		} // tc
	}// main

	public static void powerset(int idx) {
		// 기저부분
		if (idx == N) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				if (sel[i]) {// i번째사람을뽑았다
					sum += H[i];
				}
			}
			if (sum >= B) {
				ans = Math.min(ans, sum);
				return;
			}
		}

		// 재귀부분
		sel[idx] = true; // 쌓고
		powerset(idx + 1); // 내려보내고
		sel[idx] = false; // 안쌓고
		powerset(idx + 1); // 내려보내고

	}//powerset

}//class
