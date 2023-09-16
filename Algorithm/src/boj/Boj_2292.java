package boj;

import java.util.Scanner;

public class Boj_2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 1; // 겹 수
		int range = 2; // 범위의 최솟값

		if (N == 1) {
			System.out.println(cnt);

		} else {

			while (range <= N) {

				range = range + (6 * cnt);
				cnt++;

			}

			System.out.println(cnt);
		}

	}

}
