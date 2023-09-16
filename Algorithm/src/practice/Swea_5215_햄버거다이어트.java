package practice;

import java.util.Scanner;

class Hamburger {
	int score;
	int cal;

	public Hamburger() {
		// TODO Auto-generated constructor stub
	}

	Hamburger(int score, int cal) {
		this.score = score;
		this.cal = cal;
	}
}

public class Swea_5215_햄버거다이어트 {

	public static int N;
	public static int L;
	public static Hamburger[] hamburgers;
	public static int maxScore;

	// lastIdx : 이전에 선택했던 햄버거의 index
	// score : 이전까지 선택해왔던 햄버거들의 점수의 합
	// cal : 이전까지 선택해왔던 햄버거들의 칼로리의 합

	public static void recur(int lasti, int score, int cal) {

		// 이전에 lasti 햄버거를 선택했으므로 lasti + 1 부터 햄버거를 선택함
		for (int i = lasti + 1; i < N; i++) {
			// 현재 선택할 햄버거의 칼로리와 이전까지 선택해왔던 햄버거들의 칼로리의 합이 L을 넘어간다면 선택하면 안되므로 continue
			if (cal + hamburgers[i].cal > L) {
				continue;
			}
			// 현재 선택한 햄버거의 인덱스, 지금까지의 점수와 현재 햄버거의 점수를 더한 값,
			// 지금까지의 칼로리와 현재 햄버거의 칼로리를 더한 값을 인자로 넘겨주고 재귀호출
			recur(i, score + hamburgers[i].score, cal + hamburgers[i].cal);
		}
		// 재귀함수가 호출될 때마다 점수의 최댓값을 갱신해줌
		maxScore = Math.max(maxScore, score);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); //햄버거의 개수
			L = sc.nextInt(); //칼로리 제한
			
			//최대 스코어는 매 tc마다 초기화 해줘야함
			maxScore = -1;
			
			hamburgers = new Hamburger[N];
			for(int i = 0; i < N; i++) {
				hamburgers[i] = new Hamburger(sc.nextInt(), sc.nextInt());
			}
			recur(-1, 0, 0);
			
			System.out.println("#" + tc + " " + maxScore);
		}
		
	}

}
