package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_17608 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); // 막대의 개수

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < T; i++) {
			int m = Integer.parseInt(br.readLine()); // 막대의 높이 하나씩 입력받기

			if (stack.isEmpty()) { // 스택이 비워져 있을 때
				stack.push(m);
			} else { // 스택이 비워져 있지 않을 때
				if (m < stack.peek()) { // top에 있는 막대가 더 크면
					stack.push(m);
				} else if (m >= stack.peek()) { // top에 있는 막대가 더 작으면
					while (!stack.isEmpty() && stack.peek() <= m) {
						stack.pop();
					}
					stack.push(m);
				}

			}
		}
		int size = stack.size();
		System.out.println(size);
	}// main

}// class
