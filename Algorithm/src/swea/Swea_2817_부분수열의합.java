package swea;

import java.util.Scanner;

public class Swea_2817_부분수열의합 {

	public static int N;
	public static int K;
	public static int arr[];
	public static int ans;

	public static void solve(int count, int sum) {
		// 기저 파트
		if (sum == K) {
			ans++;
			return;
		} // 자연수 x개 선택해서 합이 K가 되는 경우

		else if (sum > K || count >= N) {
			return;
		} // 자연수 x개의 합이 K보다 큰 경우 || 선택한 자연수의 갯수가 N개와 동일한 경우

		// 자기자신 포함
		solve(count + 1, sum + arr[count]);

		// 자기자신 미포함
		solve(count + 1, sum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			N = sc.nextInt();

			K = sc.nextInt();

			arr = new int[N];
			ans = 0;
			

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			solve(0, 0);
			System.out.println("#" + tc + " " + ans);

		}//tc

	}

}
