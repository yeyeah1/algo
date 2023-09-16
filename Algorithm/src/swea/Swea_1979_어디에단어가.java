package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea_1979_어디에단어가 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("input.txt"));

		int T = sc.nextInt(); // tc 개수 입력

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 전체 퍼즐의 크기 N
			int K = sc.nextInt(); // 단어의 길이 K

			int[][] puz = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					puz[i][j] = sc.nextInt();
				}
			} // 퍼즐 값 입력받기

			int cnt = 0;
			int cnt2 = 0;

			// 1.행우선순회
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if ((j == 0 && puz[i][j] == 1) || (j > 0 && puz[i][j] == 1 && puz[i][j-1] != 1)) { 
						// 내가 서있는 곳이 1이고 내 왼쪽이 1이 아닐때
						// 여기에 j-1 >= 0 을 걸면 안돼
						

						int d = 1; // d는 0부터 시작
						while (j + d < N && puz[i][j + d] == 1) { // 오른쪽으로 가는 동안 (j+d) 1이면 d++
							d++;
						}

						if (d == K) { // 단어 길이 K랑 d랑 같으면 cnt++
							cnt++;
						}
					}

				}
			} // 행우선 순회하는 for문

			// 2. 열우선 순회
			for (int j = 0; j < N; j++) {
				for (int i = 0; i < N; i++) {

					if ((i == 0 && puz[i][j] == 1) || (i > 0 && puz[i][j] == 1 && puz[i-1][j] != 1)) {

						int d = 1;
						while (i + d < N && puz[i + d][j] == 1) {
							d++;
						}

						if (d == K) {
							cnt2++;
						}
					}
				}
			} // 열우선 순회 for문

			System.out.println("#" + tc + " " + (cnt + cnt2));

		} // 전체 tc 도는 for문

	}// main

}// class
