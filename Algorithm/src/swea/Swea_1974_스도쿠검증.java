package swea;

import java.util.Scanner;

public class Swea_1974_스도쿠검증 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int[][] map = new int[9][9];
			int N = map.length;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			} // 배열 값 입력

			int sum = 0; // 1~9를 다 더한 값
			int mul = 1; // 1~9를 다 곱한 값

			int cnt = 0; // 한 줄에 겹치는 숫자가 없다면 체크할 변수
			int res = 1; // 결과

			// 행 순회
			Loop1: for (int r = 0; r < N; r++) {
				sum = 0;
				mul = 1;
				for (int c = 0; c < N; c++) {
					sum += map[r][c];
					mul *= map[r][c];

				}
				if (sum == 45 && mul == 362880) { // 한 줄에 1~9까지 다 있을 때
					cnt++;
				} else { // 겹치는 수가 있으면 빠져나가기
					res = 0;
					break Loop1;
				}
			}

			// 열순회
			Loop2: for (int c = 0; c < N; c++) {
				sum = 0;
				mul = 1;
				for (int r = 0; r < N; r++) {
					sum += map[r][c];
					mul *= map[r][c];

				}
				if (sum == 45 && mul == 362880) { // 한 줄에 1~9까지 다 있을 때
					cnt++;
				} else {
					res = 0;
					break Loop2;
				}
			}

			// 작은 9칸 순회

			Loop3: for (int r = 0; r < 7; r++) {
				for (int c = 0; c < 7; c++) { // 전체 순회하면서
					sum = 0;
					mul = 1;
					if ((r == 0 || r == 3 || r == 6) && (c == 0 || c == 3 || c == 6)) { // r,c가 0,3,6 일 때

						for (int i = r; i < r + 3; i++) {
							for (int j = c; j < c + 3; j++) {
								sum += map[i][j];
								mul *= map[i][j];
							}
						}
						if (sum == 45 && mul == 362880) { // 한 줄에 1~9까지 다 있을 때
							cnt++;
						} else { // 다른 값이 2번 이상 나오면 빠져나가기
							res = 0;
							break Loop3;
						}

					} else
						continue; // 0, 3, 6아니면 넘어가기

				}
			}

			if (cnt == 27) {
				res = 1;
			}

			System.out.print("#" + tc + " ");
			System.out.println(res);

		} // tc도는 for문

	}

}
