package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Swea_3499_퍼펙트셔플 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		Queue<String> queue1 = new LinkedList<>();
		Queue<String> queue2 = new LinkedList<>();
		Queue<String> queue3 = new LinkedList<>();

		int T = Integer.parseInt(br.readLine()); // 테스트케이스 수 입력
		int len = 0;
		int tc;

		for (tc = 1; tc <= T; tc++) {

			len = Integer.parseInt(br.readLine()); // 문장의 길이 입력

			st = new StringTokenizer(br.readLine()); // 문장을 입력받고 공백 기준으로 나눠준다

			for (int i = 0; i < len; i++) {

				String card = st.nextToken(); // card....

				if (i < (len / 2) + (len % 2)) { // len의 반절 처음엔 queue1
					queue1.add(card);
				} else // 반절 이후엔 queue2
					queue2.add(card);
			} //삽입하는 for문
			
			
			for (int i = 0; i < len; i++) {
				if (i % 2 ==0) {// i가 짝수면 q1 을 q3으로
					queue3.add(queue1.remove());
				}else { //홀수면 q2를 q3으로
					queue3.add(queue2.remove());

				} // queue1 queue2에 하나씩 add
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < len; i++) {
				System.out.print(queue3.remove() + " ");
			}
			System.out.println();

		}//전체 도는 case

	}// main

}// class
