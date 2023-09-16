package swea;

import java.util.Arrays;
import java.util.Scanner;

public class Swea_1289_원재의메모리복구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			String[] origin = sc.next().split("");

			int[] memory = new int[origin.length];

			for (int i = 0; i < memory.length; i++) {
				memory[i] = Integer.parseInt(origin[i]);
			} // 메모리 값 입력 받았다!

			int cnt = 0;

			if (memory[0] == 1)
				cnt++;

			for (int i = 1; i < memory.length; i++) {

				if (memory[i - 1] != memory[i]) {
					cnt++;
				}
			}

			System.out.println("#" + tc + " " + cnt);

		} // tc

	}// main

}
