package swea;

import java.util.Scanner;

public class Swea_1231_중위순회 {
	static int N;
	static char[] tree;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {

			N = sc.nextInt(); // 정점의 수

			tree = new char[N + 1]; // 1~N번 인덱스까지 써야함

			for (int i = 0; i < N; i++) {

				int x = sc.nextInt(); // 처음 입력 숫자
				String node = sc.next();

				if (x * 2 < N) {
					tree[i + 1] = node.charAt(0); // 배열에 값 입력
					sc.nextInt();
					sc.nextInt(); // 다음 들어오는 값 두 번 버리기
				} else if (x * 2 == N) {
					tree[i + 1] = node.charAt(0);
					sc.nextInt();
				} else {
					tree[i + 1] = node.charAt(0);
				}

			} // tree배열에 값 입력하기
//			System.out.println(Arrays.toString(tree));
			System.out.print("#" + tc + " ");
			inOrder(1);
			System.out.println();

		} // 10번 반복 for문

	}// main

	// 중위순회
	public static void inOrder(int i) {
		if (i < N + 1) { // 인덱스 범위 안에 들어오고
			inOrder(i * 2);

			if (tree[i] != ' ') {
				System.out.print(tree[i]);
			}
			
			inOrder(i * 2 + 1);

		}
	}

}
