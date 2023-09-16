package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Swea_1222_계산기1 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("input.txt"));

		for (int tc = 1; tc <= 10; tc++) {

			int len = sc.nextInt(); // 문자열 길이 입력

			String str = sc.next(); // 문자열 입력

			Stack<Character> stack = new Stack<>();

			String str2 = ""; // 후위표기식을 담을 String

			for (int i = 0; i < len; i++) { // 문자열의 길이 동안

				char c = str.charAt(i); // 하나씩 char로 변환해서

				if (c != '+') { // 지금은 + 연산자만 쓰니까
					str2 = str2 + c; // +가 아니면 문자열에 추가
				} else {

					if (stack.isEmpty()) {// 스택이 비어있으면 스택에 push
						stack.push(c);

					} else { // +는 +랑 우선순위가 같으니까 있는거 빼내고 str2에 추가 push
						str2 += stack.pop();
						stack.push(c);
					}
				}
			}
			if (!stack.isEmpty()) { // 마지막 남아있는 +까지,,~!
				str2 += stack.pop();
			}

			// 여기까지 중위 표기식 -> 후위 표기식

			Stack<Integer> stack2 = new Stack<>();

			int sum = 0;
			int a;
			int b;

			for (int i = 0; i < str2.length(); i++) {

				char c2 = str2.charAt(i);

				if (c2 != '+') { // 숫자라면 push
					int c3 = Character.getNumericValue(c2);
					stack2.push(c3);
				} else if (c2 == '+') {
					b = stack2.pop(); // 맨 위에 있던 값
					a = stack2.pop(); // 그 아래에 있던 값
					sum = a + b;
					stack2.push(sum);

				}

			} // 계산식 만드는 for문

			System.out.println("#" + tc + " " + stack2.pop());

		} // 10번 반복 for문

	}// main

}// class

//Stack<Integer> stack2 = new Stack<>();
//
//int sum = 0;
//int a;
//int b;
//
//for (int i = 0; i < str2.length(); i++) {
//
//	String[] c2 = str2.split("");
//	
//	if(!c2[i].equals("+")) { //숫자라면 push
//		int c3 = Integer.valueOf(c2[i]); 
//		stack2.push(c3); 
//	}else if (c2[i].equals("+")) { //+라면
//		b = stack2.pop(); //맨 위에 있던 값
//		a = stack2.pop(); //그 아래에 있던 값
//		sum += a + b;
//		stack2.push(sum);
//		
//	}

//
//
//Stack<Integer> stack2 = new Stack<>();
//
//int sum = 0;
//int a;
//int b;
//
//for (int i = 0; i < str2.length(); i++) {
//
//	int c2 = str2.charAt(i);
//	
//	if(c2 != '+') { //숫자라면 push
//		stack2.push(c2); 
//	}else if (stack2.size() >= 2 && c2 == '+') { //stack에 값 2개 이상 있고 +라면
//		b = stack2.pop(); //맨 위에 있던 값
//		a = stack2.pop(); //그 아래에 있던 값
//		sum += a + b;
//		stack2.push(sum);
//		
//	}
////	}else if (stack.isEmpty() && c2 == '+') { //스택이 비어있고 +라면
////		stack.push(c2);
////	}
//
//}//계산식 만드는 for문
//
//
//System.out.println(stack2.pop());
