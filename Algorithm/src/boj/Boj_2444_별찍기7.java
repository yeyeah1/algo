package boj;

import java.util.Scanner;

public class Boj_2444_별찍기7 {

	public static void main(String[] args) {

		// 2*N-1 번째 줄까지 출력
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 퍼지는 모양

		// 일단 N줄 까지
		for (int i = 0; i < N; i++) {

			for (int j = N - 1 - i; j > 0; j--) {
				System.out.print(" ");
			} // " " 출력

			for (int k = 1; k <= (i * 2) + 1; k++) {
				System.out.print("*");
			} // *출력

			System.out.println();
		} // 퍼지는 모양

		// 줄어드는 모양

		// N-1줄동안
		for (int i = 0; i < N - 1; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}

			for (int k = (i*2)+1; k < (N-1)*2; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
