package swea;

import java.util.Arrays;
import java.util.Scanner;

public class Swea_1860_진기의최고급붕어빵 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt(); // 손님의 수
			int M = sc.nextInt(); // 붕어빵을 만드는 데 걸리는 초
			int K = sc.nextInt(); // 한번에 몇개의 붕어빵을 생산?

			int[] pNum = new int[N];
			String res = "Possible";

			for (int i = 0; i < N; i++) {
				pNum[i] = sc.nextInt();
			} // 손님이 몇초에 한 번 오는지 입력

			Arrays.sort(pNum);
			int cnt = 0;

			for (int i = 0; i < N; i++) {
				cnt = (pNum[i] / M) * K - i;
				if (cnt <= 0) {
					res = "Impossible";
				}
			}


			System.out.println("#" + tc + " " + res);

		} // tc도는 for문

	}

}
