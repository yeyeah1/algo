package swea;
import java.util.Scanner;

public class Swea_1954_달팽이숫자 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 바뀌는 진행방향이 우 하 좌 상
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt(); // 배열의 크기가 될 N값 입력

			int[][] map = new int[N][N]; // N*N크기의 배열 만들기

			int d = 0;
			int r = 0;
			int c = 0;

			for (int i = 0; i < N * N; i++) {

				map[r][c] = i + 1; // 처음 시작자리

				int nr = r + dr[d];
				int nc = c + dc[d]; // 다음자리 인덱스

				if (nr >= N || nr < 0 || nc >= N || nc < 0 || map[nr][nc] != 0) {
					d = (d + 1) % 4;
				} // 범위를 벗어나면 d를 다음 방향으로 이동시킴

				r = r + dr[d];
				c = c + dc[d]; // 자리를 이동시킴

			} // 1부터 N*N까지 숫자 입력하는 for문

			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}

		} // 전체 tc

	}// main

}// class
