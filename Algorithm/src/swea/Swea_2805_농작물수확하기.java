package swea;

import java.util.Scanner;

public class Swea_2805_농작물수확하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt(); // 농장의 크기

			int[][] farm = new int[N][N];

			for (int i = 0; i < N; i++) {
				String[] str = sc.next().split("");
				for (int j = 0; j < N; j++) {
					farm[i][j] = Integer.parseInt(str[j]);
				}
			} // 농장 데이터 입력받기

			int sum = 0;
			int m = N / 2;
			// 반절만 증가하는 모양
			for (int r = 0; r < m; r++) {
				for (int c = m - r; c <= m + r; c++) {
					sum += farm[r][c];
				}

			}

			// 반대로 내려갈 때
			int k = m;
			for (int r = m; r < N; r++, k--) {
				for (int c = m - k; c <= m + k; c++) {
					sum += farm[r][c];
				}

			}

			System.out.println("#" + tc + " " + sum);

		} // tc 도는 for문

	}

}
