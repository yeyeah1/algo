package boj;

import java.util.Scanner;

public class Boj_10163_색종이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] paper = new int[101][101]; // 도화지 크기
		int len = paper.length;

		int N = sc.nextInt(); // 색종이의 장수

		for (int i = 1; i <= N; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			for (int x = a; x < a + c; x++) {
				for (int y = b; y < b + d; y++) {
					paper[x][y] = i;
				}
			}

		} // 색종이 정보 입력받기

		// N 길이의 배열(area)을 생성해서 area의 인덱스랑 paper의 값이 같으면 카운트
		int[] area = new int[N];

		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			for (int r = 0; r < len; r++) {
				for (int c = 0; c < len; c++) {

					if (paper[r][c] == i) {
						cnt++;
					}
				}
			}

			System.out.println(cnt);
		}

	}// main

}
