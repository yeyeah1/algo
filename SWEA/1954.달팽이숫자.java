
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 첫줄에 tc개수 T , 그 밑으로 배열의 크기 N 입력

		Scanner sc = new Scanner(new File("input.txt"));

		int T = sc.nextInt();

		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			int[][] dal = new int[N][N]; // 배열의 크기 입력받아 2차원 배열 생성

			int d = 0;
			int r = 0;
			int c = 0;

			for (int i = 0; i < N * N; i++) {

				dal[r][c] = i + 1; // 처음 시작자리

				int nr = r + dr[d]; // 다음자리의 인덱스
				int nc = c + dc[d];

				// 범위를 먼저 체크하고 값을 비교해야지!!!!!!!!!!!!!!!!!!!!!!!! 이게 바로 단축평가
				// 맨 뒤에 != 문장이 맨 앞으로 오면 안됨. 터짐. 나의 속처럼
				if (nr >= N || nr < 0 || nc >= N || nc < 0 || dal[nr][nc] != 0) {
					d = (d + 1) % 4; // 이걸 계속 돌리려면 ++아니고 이 식 자체를 넣어야함
				}

				r = r + dr[d];
				c = c + dc[d]; // 현재 위치를 이동시켰다
				
				}
			System.out.println("#"+tc);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					System.out.print(dal[i][j]+ " ");
				}
				System.out.println();

			} // N*N만큼의 숫자를 입력하는 for문


		} // 전체 tc를 반복하는 for문

	}// main

}// class
