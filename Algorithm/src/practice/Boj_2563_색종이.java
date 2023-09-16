package practice;

import java.util.Scanner;

public class Boj_2563_색종이 {

	public static void main(String[] args) {
		/*
		 * 도화지의 크기는 100*100 색종이의 크기는 10*10
		 * 
		 * 겹쳐져 있는 부분 빼고 색종이 넓이 출력하기
		 * 
		 */

		boolean[][] paper = new boolean[101][101];

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// 색종이의 수

		for (int i = 0; i < N; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					paper[k][j] = true;
				}
			}

		} // 색종이 입력

		int cnt = 0;

		for (int r = 0; r < paper.length; r++) {
			for (int c = 0; c < paper.length; c++) {
				if (paper[r][c]) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}// main

}
