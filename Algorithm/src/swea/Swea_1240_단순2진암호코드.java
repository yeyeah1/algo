package swea;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Swea_1240_단순2진암호코드 {

	public static void main(String[] args) throws IOException {
		/*
		 * 0 : 0001101 
		 * 1 : 0011001 
		 * 2 : 0010011 
		 * 3 : 0111101 
		 * 4 : 0100011 
		 * 5 : 0110001 
		 * 6 : 0101111 
		 * 7 : 0111011 
		 * 8 : 0110111 
		 * 9 : 0001011
		 * 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken()); //배열의 세로
			int M = Integer.parseInt(st.nextToken()); //배열의 가로

			int[][] map = new int[N][M];

			// 암호코드 입력받아옴
			for (int i = 0; i < N; i++) {
				String str = br.readLine();
				for (int j = 0; j < M; j++) {
					map[i][j] = str.charAt(j)-'0';
				}
			}
			
			//이진수들을 배열에 넣어줌
			String[] code = { "0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011",
					"0110111", "0001011" };

			// 56길이의 배열 생성
			int[] nums = new int[56];
			int len = nums.length;
			
			//배열을 반대로 순회하는 동안
			for (int i = 0; i < N; i++) {
				for (int j = M-1; j >= 0; j--) {

					if (map[i][j] == 1) { //1을 발견하면
						for(int k = 0; k < 56; k++) {
							nums[k] = map[i][j-k]; //code배열에 저장해주기
						}
						break; 
					}
				}
			} //네개씩 쪼개서 같은 숫자 패턴(암호)면 숫자 저장하기

//				System.out.print(Arrays.toString(code));
//				System.out.println();
			
			int[] realNum = new int[8];
			String str, tmp, sub = "";
			int count = 0;
			
			
			//8자씩 잘라서 비교하기
			for (int k = 0; k < sub.length(); k = k + 7) {
				tmp = sub.substring(k, k + 7);
				for (int l = 0; l < code.length; l++) {
					if (tmp.equals(code[l])) {
						realNum[count++] = l;
					}
				}
				
			
			
			
			
			}

		} // tc

	}

}
