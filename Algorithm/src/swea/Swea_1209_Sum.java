package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea_1209_Sum {

	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * 100x100의 2차원 배열 각 행의 합, 각 열의 합, 각 대각선의 합 중 최댓값 구하기 동일한 최댓값이 있다면 하나만 출력하기
		 * 
		 */

		Scanner sc = new Scanner(new File("input.txt"));

		for (int t = 1; t <= 10; t++) {// 총 10번 도는 동안

			int tc = sc.nextInt(); // 테스트 케이스 번호 먼저 입력 받고

			int[][] map = new int[100][100]; // 100크기의 2차원 배열 생성

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) { // 각 요소 값 입력
					map[i][j] = sc.nextInt();
				}
			}

			int sum = 0; // 각 줄의 합
			int max1 = 0; // 행의 합 최댓값
			int max2 = 0; // 열의 합 최댓값
			int max3 = 0; // 왼오 대각선 합 최댓값
			int max4 = 0; // 오왼 대각선 합 최댓값

			// 각 행의 총합 먼저 구해주기

			// 1.행의 합 최댓값
			for (int r = 0; r < 100; r++) {
				for (int c = 0; c < 100; c++) {
					sum += map[r][c];
				}
				if (sum > max1) {
					max1 = sum;
				}
				sum = 0; // 한줄 씩 비교해야하니까 sum 초기화해주기

			} // 행의 합 최댓값 구하는 for문

			// 2.열의 합 최댓값
			for (int c = 0; c < 100; c++) {
				for (int r = 0; r < 100; r++) {
					sum += map[r][c];
				}
				if (sum > max2) {
					max2 = sum;
				}
				sum = 0;
			} // 열의 합 최댓값 구하는 for문

			// 3.왼오 대각선 합 최댓값
			for (int r = 0; r < 100; r++) {
				for (int c = 0; c < 100; c++) {
					if (r == c) {
						sum += map[r][c];
					}
					if (sum > max3) {
						max3 = sum;
					}
				}
				sum = 0;
			} // 왼오 대각선 합 최댓값 구하는 for문

			// 4.오왼 대각선 합 최댓값
			for (int r = 0; r < 100; r++) {
				for (int c = 0; c < 100; c++) {
					if (r + c == 99) {
						sum += map[r][c];
					}
					if (sum > max4) {
						max4 = sum;
					}
				}
			} // 오왼 대각선 합 최댓값 구하는 for문

			// 이제 max 4개 중에 제일 큰 놈을 구하자

			int[] arr = { max1, max2, max3, max4 };

			int finalMax = 0;

			for (int i = 0; i < 4; i++) {
				if (arr[i] > finalMax) {
					finalMax = arr[i];
				}
			}
			System.out.println("#" + tc + " " +finalMax);

		} // 10번 도는 큰 for문

	}// main

}// class
