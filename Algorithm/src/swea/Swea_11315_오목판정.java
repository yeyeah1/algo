package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea_11315_오목판정 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("input.txt"));

		// 첫째줄에 tc 갯수 T 입력받기

		int T = sc.nextInt();
		int cnt = 0;

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			char[][] map = new char[N][N];

			// 배열 요소 입력받기
			// 새로 알게 된 사실, Scanner는 char입력을 못받는다!
			// String으로 입력받고 char로 변환해주기

			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j);
				}
			}

			Loop0: while (true) {
				// 1.행방향순회

				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (map[r][c] == 'o') {
							cnt++;
						} else
							cnt = 0;

						if (cnt == 5) {
							System.out.println("#"+tc+" " + "YES");
							break Loop0;
						}
					}

					cnt = 0;
				}

				// 2.열방향 순회
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (map[c][r] == 'o') {
							cnt++;
						} else
							cnt = 0;

						if (cnt == 5) {
							System.out.println("#"+tc+" " + "YES");
							break Loop0;
						}
					}
					cnt = 0;
				}

				// 3.왼오 대각선 순회

				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (map[r][c] == 'o') {
							for (int k = 0; k < 5; k++) {
								if (r + k < N && c + k < N && map[r + k][c + k] == 'o') {
									cnt++;
								} else
									cnt = 0;
							}
						}
						if (cnt == 5) {
							System.out.println("#"+tc+" " + "YES");
							break Loop0;
						}
					}
					cnt = 0;
				}

				// 4.오왼 대각선 순회
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (map[r][c] == 'o') {
							for (int k = 0; k < 5; k++) {
								if (r + k < N && c - k >= 0 && map[r + k][c - k] == 'o') {
									cnt++;
								} else
									cnt = 0;
							}
						}
						if (cnt == 5) {
							System.out.println("#"+tc+" " + "YES");
							break Loop0;
						}
					}
				}

				if (cnt < 5) {
					System.out.println("#"+tc+" " + "NO");
					break Loop0;
				}
			} // Loop0

		} // 전체 tc 도는 for문

	}// main

}// class
