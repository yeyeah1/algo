package swea;

import java.util.Arrays;
import java.util.Scanner;

// 햄버거는 점수와 칼로리를 가지고 있으므로 클래스를 선언해주었음
// 햄버거 클래스 대신 2차원 배열을 사용해서 0번 인덱스에는 점수, 1번 인덱스에는 칼로리를 저장해주어도 무방
class Hamburger {
	int score;
	int cal;

	Hamburger(int score, int cal) {
		this.score = score;
		this.cal = cal;
	}
}

public class Swea_5215_햄버거다이어트 {

	// main메소드 밖에서 접근할 수 있도록 전역변수로 선언
	public static int N, L;
	public static Hamburger[] hamburgers; // 햄버거들을 담을 배열
	public static int maxScore; // 점수의 최댓값

	// lasti : 이전에 선택했던 햄버거의 index
	// score : 이전까지 선택해왔던 햄버거들의 점수의 합
	// cal : 이전까지 선택해왔던 햄버거들의 칼로리의 합

	// 재귀함수가 호출 될 때마다 햄버거 하나를 선택하는 과정을 수행함

	public static void recur(int lasti, int score, int cal) {

		// 이전에 lasti 햄버거를 선택했으므로 lasti + 1부터 햄버거를 선택함
		for (int i = lasti + 1; i < N; i++) {
			// 현재 선택할 햄버거의 칼로리와 이전까지 선택해왔던 햄버거들의 칼로리의 합이 L을 넘어간다면 선택하면 안되므로 continue
			if (cal + hamburgers[i].cal > L)
				continue;
			// 현재 선택한 햄버거의 인덱스, 지금까지의 점수와 현재 햄버거의 점수를 더한 값, 지금까지의 칼로리와 현재 햄버거의 칼로리를 더한 값을
			// 인자로 넘겨주고 재귀호출
			recur(i, score + hamburgers[i].score, cal + hamburgers[i].cal);
		}

		// 재귀함수가 호출 될 때마다 점수의 최댓값을 갱신해줌
		maxScore = Math.max(maxScore, score);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); // 햄버거의 개수
			L = sc.nextInt(); // 칼로리 제한

			// 최대 스코어는 매 test case마다 초기화해줘야함
			maxScore = -1;

			hamburgers = new Hamburger[N];
			for (int i = 0; i < N; i++) {
				hamburgers[i] = new Hamburger(sc.nextInt(), sc.nextInt());
			}

			// 재귀함수를 사용해서 햄버거들을 선택하는 조합을 구한다
			// recur(lasti, score, cal)
			// lasti는 이전에 선택했던 햄버거의 번호인데 처음 호출해줄때는 선택한 햄버거가 없으므로 -1
			// 그러면 -1 + 1 = 0부터 햄버거를 선택하게 됨
			// 처음에는 선택한 햄버거가 없으므로 score, cal은 0
			recur(-1, 0, 0);

			System.out.println("#" + test_case + " " + maxScore);
		}
	}
}
