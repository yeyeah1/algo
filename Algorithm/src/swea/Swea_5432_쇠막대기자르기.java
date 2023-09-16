package swea;

import java.util.Scanner;
import java.util.Stack;

public class Swea_5432_쇠막대기자르기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			Stack<Character> stack = new Stack<>();

			String stick = sc.next(); // 쇠막대기+레이저

			int sum = 0; // 자른 막대기 수의 합

			int len = stick.length();

			for (int i = 0; i < len; i++) {

				char piece = stick.charAt(i); // 하나씩입력

				if (piece == '(') {  
					stack.push(piece);
				} else {
					
					if (piece == ')' && stick.charAt(i - 1) == ')') {
						stack.pop();
						sum += 1;
					} else {
						stack.pop();
						sum += stack.size();
					}
				}

			} // 큰 막대기 도는 for문
			System.out.println("#" + tc + " " + sum);
			sum = 0;

		} // tc도는 for문

	}// main

}// class
