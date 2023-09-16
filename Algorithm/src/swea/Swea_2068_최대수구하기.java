package swea;

import java.util.Scanner;

public class Swea_2068_최대수구하기 {

	public static void main(String[] args) {

		/*
		 * [입력]
		 *
		 * 가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
		 *
		 * 각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.
		 *
		 * [출력] 출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다. (t는 테스트 케이스의 번호를 의미하며 1부터
		 * 시작한다.)
		 */

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[] arr = new int[10];

		for (int tc = 1; tc <= T; tc++) {

			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			} // arr배열의 요소값 입력받기

			int max = -1;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			} // 최댓값 구하기
			System.out.println("#" + tc + " " + max);

		} // tc 도는 큰 for문

	}

}
