package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea_1225_암호생성기 {

	// 배열 선언하기 (createQueue)
	public static int[] queue = new int[8];

	// front, rear 값 설정, 비어있으니까 -1로 설정
	public static int front = -1, rear = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int tc = 1; tc <= 10; tc++) {
			br.readLine(); // tc입력받는데 필요없음

			st = new StringTokenizer(br.readLine()); // 공백을 기준으로 String을 나눠줌

			int tmp;

			front = -1;
			rear = -1;

			for (int i = 0; i < 8; i++) { // 8개로 쪼개진 값을

				if (isFull() == false) { // 배열이 포화상태가 아니라면

					enQueue(Integer.parseInt(st.nextToken())); // queue에 삽입

				}
			}

			if (isEmpty() != true) { // queue가 비어있지 않다면

				int i = 1;
				while (queue[7] > 0) {// queue의 0번째 인덱스의 값이 0이상이고 i가 5 이하인 동안
					queue[0] = queue[0] - i++; // 0번째 원소의 값에서 i를 빼주고
					tmp = queue[0]; // 변수에 잠깐 값을 담아둔다

					if (i == 6) {
						i = 1;
					}

					// 배열의 값들을 인덱스 하나씩 당겨주기
					for (int j = 1; j < 8; j++) {
						queue[j - 1] = queue[j];
					}

					// 맨 앞에 있던 값을 맨 뒤로
					queue[7] = tmp;

					if (queue[7] < 0) {
						queue[7] = 0;
					}

				}
			}

			System.out.print("#" + tc + " ");
			for (int i = 0; i < 8; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();

		} // 10번 도는 for문

	}// main

	// 비어있는지 확인
	public static boolean isEmpty() {

		return front == rear;
	}

	// 포화상태인지 확인 -> rear가 마지막 인덱스 위치에 가있을 때
	// 포화가 아닐 수도 있음
	public static boolean isFull() {

		return rear == queue.length - 1;
	}

	// 삽입
	public static void enQueue(int num) {
		if (isFull()) { // queue가 포화상태면
			return;
		} // 포화상태가 아니라면 rear 뒤의 인덱스에 값 넣어주기
		queue[++rear] = num;
	}

	// 삭제
	public static int deQueue() {
		if (isEmpty()) { // queue가 비어있다면
			return -1; // queue값으로 있을 수 없는 숫자 리턴
		} // 비어있지 않다면 front 뒤의 인덱스 값 빼주기
		return queue[++front];
	}

}// class
