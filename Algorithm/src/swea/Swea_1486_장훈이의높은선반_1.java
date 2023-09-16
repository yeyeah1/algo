package swea;

import java.util.Scanner;

public class Swea_1486_장훈이의높은선반_1 {

	static int N, B, ans; // N: 점원의 수, B : 선반의 높이 1 ~ 모든점원키의합
	static int[] H; // 점원들의 키 배열

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			N = sc.nextInt();
			B = sc.nextInt();
			H = new int[N];

			for (int i = 0; i < N; i++) {
				H[i] = sc.nextInt();
			} // 입력 끝
				/////////////////////////////////////////

//			ans = Integer.MAX_VALUE;
			ans = 987654321; // 이런식으로 선언해줘도 됨. 최솟값 구해야하니까
			// 많이 큰 수로 정해놓으면 됨!

			// 1. for문(모든 부분집합을 돌아보겠다.)
			for (int i = 0; i < (1 << N); i++) {
				// 2. for문(i는 부분집합인데 어떤 점원을 가진 부분집합인지 모르니까 검사할래)
				int sum = 0; // 중간 합
				for (int j = 0; j < N; j++) {
					// 이게 참이라면 j번째 점원이 이번 탑에 포함됐다 라는 이야기
					if ((i & (1 << j)) != 0) {
						sum += H[j];
					}
				} // 탑 다 쌓았다
					// 적어도 선반의 키는 넘겨야 하니까
				if (sum >= B && sum < ans) {
					ans = sum;
				}

//				if(sum >= B) {
//					ans = Math.min(ans, sum);
//					ans = sum < ans ? sum : ans;
//				}

			}

			System.out.println("#" + tc + " " + (ans - B));

		} // tc

	}// main

}
