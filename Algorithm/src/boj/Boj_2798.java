package boj;

import java.util.Scanner;

public class Boj_2798 {

	public static void main(String[] args) {
		// N장의 카드 중에서 3장을 뽑아 M을 넘지 않으면서 최대한 가까운 카드 3장의 합 구하기

		// 입력
		// 첫째줄에 카드의 개수 N와 M이 주어진다
		// 둘째줄에 카드에 쓰여있는 숫자가 주어진다

		// M을 넘지 않는 가장 가까운 3장의 합 출력

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] cards = new int[N];

		for (int i = 0; i < N; i++) {
			cards[i] = sc.nextInt();
		}

		// 여기까지 카드 값 다 받아옴

		int res = 0;

		// 3중 for문이면 되려나
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				if (cards[i] + cards[j] <= M) {
					for (int k = j + 1; k < N; k++) {

						int sum = cards[i] + cards[j] + cards[k];

						if (sum == M) {
							res = sum;
							break;
						} else if (sum < M && sum > res) {
							res = sum;
							continue;
						} else
							continue;
					}
				}
			}
		}

		System.out.println(res);

	}

}
