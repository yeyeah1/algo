package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Swea_1218_괄호짝짓기 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("input.txt"));

		for (int tc = 1; tc <= 10; tc++) {

			int len = sc.nextInt(); // 문자열의 길이 입력받기

			String input = sc.next(); // 문장을 입력받고

			Stack<Character> stack = new Stack<>();// 스택만들기

			int res = 0;

			for (int i = 0; i < len; i++) {

				char c = input.charAt(i);

				switch (c) { // char로 바꿔서 하나씩 비교

				case '(':
				case '{':
				case '[':
				case '<': // 여는 괄호면 push
					stack.push(c);
					break;

				// 닫는 괄호면 peek 확인하고 pop
				case ')':
					if (stack.size() > 0 && stack.peek() == '(') {
						stack.pop();
					} else {
						stack.push(c);
					}

					break;

				case '}':
					if (stack.size() > 0 && stack.peek() == '{') {
						stack.pop();
					} else {
						stack.push(c);
					}
					break;

				case ']':
					if (stack.size() > 0 && stack.peek() == '[') {
						stack.pop();
					} else {
						stack.push(c);
					}
					break;

				case '>':
					if (stack.size() > 0 && stack.peek() == '<') {
						stack.pop();
					} else {
						stack.push(c);
					}
					break;
				}

			}

			if (stack.isEmpty()) {
				res = 1;

			} else {
				res = 0;
			}
			System.out.println("#" + tc + " " + res);

		} // 10번을 도는 tc

	} // main

}// class
