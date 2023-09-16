package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea_1213_String {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("input.txt"));

		for (int tc = 1; tc <= 10; tc++) { // tc 10번 동안

			int T = sc.nextInt();

			int cnt = 0;
			int sum = 0;

			String word = sc.next(); // 비교할 문자열 입력

			String str = sc.next(); // 검색할 문장 입력

			int N = str.length(); // 문장의 길이
			int M = word.length(); // 문자열의 길이

			for (int i = 0; i <= N - M; i++) { // 문장을 돌면서 문자열 일치하는지 확인
				cnt = 0;

				for (int j = 0; j < M; j++) {

					if (word.charAt(j) == str.charAt(i + j)) {
						cnt++; // 일치하면 cnt++
						if (cnt == M) {
							sum++;
						}
					} else
						break;

				}

			}
			System.out.println("#" + T + " " + sum);

		} // 10번 반복하는 for문

	}// main

}// class
