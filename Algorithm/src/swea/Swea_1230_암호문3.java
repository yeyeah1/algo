package swea;

import java.util.LinkedList;
import java.util.Scanner;

public class Swea_1230_암호문3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {

			LinkedList<Integer> list = new LinkedList<>();

			int N = sc.nextInt(); // 원본 암호문의 개수 N

			for (int i = 0; i < N; i++) {
				list.add(sc.nextInt()); // 암호문을 하나씩 추가해준다
			}

			int K = sc.nextInt(); // 명령어의 개수

			for (int i = 0; i < K; i++) {

				String input = sc.next();

				if (input.equals("I")) { // 삽입하는 명령어일 때
					int x = sc.nextInt(); // 삽입할 idx
					int y = sc.nextInt(); // 삽입할 암호문 개수

					for (int j = 0; j < y; j++) {
						list.add(x, sc.nextInt());
						// 값이 뒤로 밀리면 안되니까
						x++;
					} // 삽입

				} else if (input.equals("D")) { // 삭제하는 명령어일 때
					int x = sc.nextInt(); // 삭제할 idx
					int y = sc.nextInt(); // 삭제할 암호문 개수

					for (int j = 0; j < y; j++) {
						list.remove(x); // 자동으로 앞으로 당겨지니까 증감 X
					} // 삭제

				} else if (input.equals("A")) { // 맨 뒤에 붙이는 명령어일 때
					int y = sc.nextInt(); // 맨 뒤에 암호 덧붙일 개수

					for (int j = 0; j < y; j++) {
						list.addLast(sc.nextInt());

					}
				} // 덧붙이기

			} // 명령어 돌리는 for문

			System.out.print("#" + tc + " ");
			for (int k = 0; k < 10; k++) {
				System.out.print(list.get(k) + " ");
			}
			System.out.println();

		} // 10번 tc 반복

	}

}
