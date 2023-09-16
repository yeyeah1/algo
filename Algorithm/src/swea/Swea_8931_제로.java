package swea;

import java.util.Scanner;
import java.util.Stack;

public class Swea_8931_제로 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int T = sc.nextInt();

		int sum = 0;

		for (int tc = 1; tc <= T; tc++) {
			
			Stack<Integer> stack = new Stack<>();
			
			sum = 0;
			
			int N = sc.nextInt(); //N값 입력받기
			
			for (int i = 0; i < N; i++) { //N번 동안 push pop 반복
				
				int input = sc.nextInt();

				if (input != 0) {
					stack.push(input);
				} else {
					stack.pop();
				} // 여기까지 push / pop 반복


			}
			while (!stack.isEmpty()) {
				sum += stack.pop();
			}
				System.out.println("#" + tc + " " + sum);
				stack.clear();

		}//tc도는 for문

	}//main

}//class
