package swea;

import java.util.Scanner;

public class Swea_1217_거듭제곱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 1; tc++) {

			sc.next();

			int N = sc.nextInt();
			int M = sc.nextInt();

			System.out.println(func(N, M));
		}

	}

	public static int func(int N, int M) {

		if (M <= 0) {
			return 1;
			
		} else {
			return N * func(N, M - 1);

		}

	}

}
