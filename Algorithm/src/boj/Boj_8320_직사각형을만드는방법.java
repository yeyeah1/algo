package boj;

import java.util.Scanner;

public class Boj_8320_직사각형을만드는방법 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				if (i * j <= n) {
					cnt++;
				}

			}
		}
		System.out.println(cnt);

	}

}
