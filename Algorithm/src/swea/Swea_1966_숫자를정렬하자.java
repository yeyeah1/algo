package swea;

import java.util.Scanner;

public class Swea_1966_숫자를정렬하자 {

	public static void main(String[] args) {

		// 주어진 N길이의 숫자열을 오름차순으로 정렬하여 출력

		// 가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
		// 각 테스트 케이스의 첫 번째 줄에 N 이 주어지고, 다음 줄에 N 개의 숫자가 주어진다.

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			} // 배열의 요소 값 입력받기

			// 선택정렬로 해보자

			for (int i = 0; i < N-1; i++) {
				int minIdx = i; // 최솟값을 담을 배열의 인덱스 설정
				for(int j = i+1; j < N; j++) {
					if(arr[j] < arr[minIdx]) {
						minIdx = j;
					}
				} //여기까지가 최솟값의 idx값을 구함
				int tmp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = tmp;
			}

			System.out.print("#" + tc + " ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");

			}
			System.out.println();

		} // 전체 tc를 도는 큰 for문

	}// main

}// class
