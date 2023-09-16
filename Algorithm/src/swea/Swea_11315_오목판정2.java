package swea;

import java.util.Scanner;

public class Swea_11315_오목판정2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			char[][] board = new char[N][N];

			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					board[i][j] = str.charAt(j);
				}
			} // 바둑알 입력받기

			int cnt = 0;

			// 우 하 좌대 우대
			int[] dr = { 0, 1, 1, 1 };
			int[] dc = { 1, 0, -1, 1 };


			// 행순회
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					if (board[r][c] == '.') {
						cnt = 0;
						continue;
					} else { //내가 'o'일 때
						int d = 0;
						
						//다음자리좌표값
						int nr = r + dr[d];
						int nc = c + dc[d];
						
						while(nr<N||nr>=0||nc<N||nc>=0||board[nr][nc]=='o') {
							//배열의 범위 안에 있고 o인 동안
							cnt++;
							
						}
						
						
						
					}

				}
			}

		} // tc

	}

}
