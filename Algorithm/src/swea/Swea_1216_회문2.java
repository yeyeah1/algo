package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea_1216_회문2 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("input.txt"));

		char[][] map = new char[100][100]; // 100*100 길이의 배열 생성

		for (int tc = 1; tc <= 10; tc++) {

			int T = sc.nextInt(); // tc입력

			int cnt = 0;
			int max1 = 1; //한글자도 회문이니까
			int max2 = 1;
			int ans = 0;

			for (int i = 0; i < 100; i++) {
				String str = sc.next(); // 전체 배열 요소값 입력
				for (int j = 0; j < 100; j++) {
					map[i][j] = str.charAt(j);
				}

			} // 여기까지 배열 요소 입력 받음

			char[][] map2 = new char[100][100]; // 똑같은 크기의 배열 만들어서

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if (99 - i >= 0 && 99 - j >= 0) {
						map2[i][j] = map[99 - i][99 - j];
					}
				}
			} // 여기까지 배열 반대로 입력받음(행)

			// 행우선순회
			for (int i = 0; i < 100; i++) {
				cnt = 0; // 한줄 검사 하면 cnt 0으로 초기화
				for (int j = 0; j < 100; j++) {
					// 내 다음 요소도 같으면 세기
					if (j + 1 < 100 && 99 - j - 1 >= 0 && map[i][j + 1] == map2[99 - i][99 - j - 1]) {
						if (map[i][j] == map2[99 - i][99 - j]) {
							cnt++;
						}else continue;
					}
				}
				
				if (max1 < cnt) {
					max1 = cnt;
				}
			} // 행우선순회 for문

			char[][] map3 = new char[100][100]; // 똑같은 크기의 배열 만들어서

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if (99 - j >= 0 && 99 - i >= 0) {
						map3[j][i] = map[99 - j][99 - i];
					}
				}
			} // 여기까지 배열 반대로 입력받음(열)

			// 열우선순회
			for (int i = 0; i < 100; i++) {
				cnt = 0;
				for (int j = 0; j < 100; j++) {
					if (j + 1 < 100 && 99 - j - 1 >= 0 && map[j + 1][i] == map3[99 - j - 1][i]) {
						if (map[j][i] == map3[99 - j][99 - i]) {
							cnt++;
						}else continue;
					}


				}
				if (max2 < cnt) {
					max2 = cnt;
				}
			} // 열우선순회 for문

			ans = max1 > max2 ? max1 : max2;

			System.out.println("#" + T + " " + ans);
		} // 전체 tc 도는 큰 for문

	}// main

}// class
