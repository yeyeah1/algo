package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea_1989_초심자의회문검사 {

	public static void main(String[] args) throws FileNotFoundException {
		// 단어를 입력받아 회문이면 1을 출력, 아니면 0을 출력

		Scanner sc = new Scanner(new File("input.txt"));

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			String str = sc.next(); // 문자열 입력

			char[] word = new char[str.length()]; // str길이의 char배열 생성

			for (int i = 0; i < word.length; i++) { // str의 문자를 하나씩 word배열에 넣어줌
				word[i] = str.charAt(i);
//				System.out.print(word[i]);
			}
//			System.out.println();

			char[] word2 = new char[word.length]; //word의 크기와 똑같은 배열 생성

			for (int i = 0; i < word.length; i++) { //word의 맨 뒤의 요소부터 word2에 넣어주기
				word2[i] = word[word.length - 1 - i];
			}

			String word3 = String.valueOf(word2); // word2를 String 으로 저장
//				System.out.println(word3);

			if (str.equals(word3)) {
				System.out.println("#" + tc + " " + 1);
			} else
				System.out.println("#" + tc + " " + 0);

		} // 전체 tc를 도는 for문

	}// main

}// class
