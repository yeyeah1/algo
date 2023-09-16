package swea;

import java.util.Arrays;
import java.util.Scanner;

public class Swea_2063_중간값찾기 {

	public static void main(String[] args) {

		// 입력으로 N개의 점수가 주어졌을 때 중간값 출력하기

		// N은 항상 홀수

		// 입력
		// 첫줄에 N이 주어진다
		// 둘째줄에 N개의 점수가 주어진다

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int arr[] = new int[N]; // N길이의 배열 생성

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N - 1; i++) {
			int minIdx = i; // 가장 작은 수의 인덱스

			for (int j = i + 1; j < N; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j; // 비교를 하나씩 해서 minIdx보다 값이 작으면 인덱스 저장
				}

			}
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;

		} // 큰for문
			// 여기까지 배열 전체 정렬함

		System.out.println(arr[arr.length / 2]);

	}

}
