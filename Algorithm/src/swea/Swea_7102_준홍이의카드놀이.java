package swea;

import java.util.Scanner;

public class Swea_7102_준홍이의카드놀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			int M = sc.nextInt();

			int[] count = new int[N + M + 1]; // N+M 값을 길이로 하는 배열 만들기

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= M; j++)

					count[i + j]++;

			}

			int max = 0;

			for (int i = 0; i < N + M; i++) {
				if (count[i] > max) {
					max = count[i];
				}

			}
			
			System.out.print("#" + tc + " ");
			for (int i = 0; i < count.length; i++) {
				if (count[i] == max) {
					System.out.print(i + " ");
				}
			}
			System.out.println();

		} // tc도는 큰 for문

	}// main

}// class
