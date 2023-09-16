
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 입력
		// 1.건물의 개수 N
		// 2.N개의 건물의 높이
		// 3.맨 왼쪽, 오른쪽 두 건물 씩은 0

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) { // 테스트케이스
			int n = sc.nextInt();

			int[] barr = new int[n];

			for (int k = 0; k < barr.length; k++) {
				barr[k] = sc.nextInt();
			} // 건물 정보 입력받음

			int max = 0;
//		for (int i = 2; i < n - 2; i++) {
			for (int j = 2; j < n - 2; j++) {

				if (barr[j - 2] < barr[j] && barr[j - 1] < barr[j] && barr[j + 1] < barr[j] && barr[j + 2] < barr[j]) {

					int a = barr[j] - barr[j - 1];
					int b = barr[j] - barr[j - 2];
					int c = barr[j] - barr[j + 1];
					int d = barr[j] - barr[j + 2];

//					if (a < b && a < c && a < d) {
//						cnt = a;
//					} else if (b < a && b < c && b < d) {
//						cnt = b;
//					} else if (c < a && c < b && c < d) {
//						cnt = c;
//					} else if (d < a && d < b && d < c) {
//						cnt = d;
//					}
//					max += cnt;

					int min = a;

					if (min > b) {
						min = b;
					}

					if (min > c) {
						min = c;
					}

					if (min > d) {
						min = d;
					}

					max += min;

				}
			}
//		}

			System.out.println("#" + (i + 1) + " " + max);

		}
	}

}
