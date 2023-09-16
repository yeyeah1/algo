package swea;

import java.util.LinkedList;
import java.util.Scanner;

public class Swea_1228_암호문1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {

			LinkedList<Integer> list = new LinkedList<>(); // list생성
			int N = sc.nextInt(); // 원본 암호문의 길이 N

			for (int i = 0; i < N; i++) { // N의 길이 만큼
				int M = sc.nextInt(); // 암호문 입력
				list.add(M); // 하나씩 추가해준다
			}

			int K = sc.nextInt(); // 명령어의 개수 K

			for (int i = 0; i < K; i++) { // K번 암호문 수정하면서
				if (sc.next().equals("I")) { // 맨 처음 글자가 I라면
					int a = sc.nextInt(); // 삽입할 값의 idx위치
					int b = sc.nextInt(); // 삽입할 숫자의 개수

					for (int j = 0; j < b; j++) { // 하나씩 입력받아서 삽입하는데
						list.add(a, sc.nextInt());
						// 인덱스가 그대로 a면 앞에 쌓이니까
						a++;
					}
				}

			}

			System.out.print("#" + tc + " ");
			for (int i = 0; i < 10; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();

		} // 10번 도는 for문

	}

}
