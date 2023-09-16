package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea_1210_Ladder1 {

	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * 
		 */

		Scanner sc = new Scanner(new File("input.txt"));

		// 테스트케이스 입력받아! 10번동안
		for (int t = 0; t < 10; t++) {
			int tc = sc.nextInt();

			int[][] lad = new int[100][100];

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					lad[i][j] = sc.nextInt();
				}
			} // 요소 입력받는 반복문

			int pointC = 0;

			for (int r = 99, c = 0; c < 100; c++) {

				if (lad[r][c] == 2) { // 만약에 요소의 값이 2인 포인트라면
					pointC = c;

				}
			} // 시작점 찾는 반복문

			for (int r = 99, c = pointC; r >= 0; r--) {// r의 값이 0이 될때까지(맨윗칸으로올라갈때까지)
//			int r = 99;
//			int c = pointC;
//			while (r>0) {

				if (c > 0 && lad[r][c - 1] == 1) { // 좌 가 1이면
					while (c > 0 && lad[r][c - 1] == 1) {
						c = c - 1;
					}
//					r = r-1;

				} else if (c < 99 && lad[r][c + 1] == 1) {// 우 확인
					while (c < 99 && lad[r][c + 1] == 1) {
						c = c + 1;
					}
//					r = r-1;

				} else if (r - 1 >= 0 && lad[r - 1][c] == 1) { // 상 확인
//					r = r-1;

				}
				pointC = c;

			} // 맨 윗칸으로 올라가는 for문
			System.out.print("#" + tc+ " ");
			System.out.println(pointC);

		} // tc를 10번 반복하는 반복문

	}// main

}// class
