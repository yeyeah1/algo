
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 최빈수를 출력하는 프로그램
		// 학생의 수 = 1000명, 0점 이상 100점 이하

		// 입력 - 첫줄에 테스트케이스 번호,
		// 테스트 케이스 첫째줄에 번호, 둘째줄에 점수

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		
		int[] std = new int[1000]; // 1000 길이의 배열
		for (int k = 0; k < T; k++) {
			int tc = sc.nextInt(); //테스트케이스 몇번째인지 입력
			
			int max = 0; //빈도수 카운트
			int score = 0; //찐 많이 나온 점수
			
			for (int j = 0; j < 1000; j++) {

				std[j] = sc.nextInt(); // 1000명의 점수를 입력받음
			}

			int[] count = new int[101]; // 101 길이의 점수 카운트 배열 생성

			// std 배열을 쭉 돌면서 (1000) count의 인덱스 번호와 같으면 count++

			for (int i = 0; i < std.length; i++) {// std 배열을 쭉 돌면서
				for (int j = 0; j < count.length; j++) { //count배열과 비교해서
					if (std[i] == j) { //점수값이 count인덱스 값이랑 같으면
						count[j]++; //count값에 카운트
					}
				}
			}

			// 그 다음 값이 제일 큰 count배열 인덱스를 출력

			for (int i = 0; i < count.length; i++) { //1~100번째 인덱스까지
				if (count[i] >= max) { //count값이 큰걸 max값에 저장
					max = count[i];
					score = i; //가장 많이 나온 인덱스(점수)는 score
				}
			}
			System.out.println("#"+tc+" "+score);
		}

		

	}

}
