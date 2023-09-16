package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Swea_1859_백만장자프로젝트 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine()); // tc 입력

		for (int tc = 1; tc <= T; tc++) {

			int N = Integer.parseInt(br.readLine()); // 매매가 수

			st = new StringTokenizer(br.readLine()); // 매매가 입력 받아서 공백 기준으로 나눈다

			long[] price = new long[N];

			for (int i = 0; i < N; i++) {
				price[i] = Long.parseLong(st.nextToken());
			} // 매매가 입력 받았따
			
			//j값이 멀어지기만 하면 안된다.
			long cnt = 0;
			int i = price.length - 1;
			int maxIdx = i; // 최댓값의 인덱스
			int j = 1;
			
			while(maxIdx-j >= 0) {
				if(price[maxIdx] > price[maxIdx-j]) { //최댓값보다 비교값이 작으면
					cnt += price[maxIdx] - price[maxIdx - j];//값의 차 더해주고
					j++; //인덱스 한칸 옆으로 이동
				}else if (price[maxIdx] < price[maxIdx-j]) { //비교값이 크면
					maxIdx = maxIdx-j; //최대값 인덱스 바꿔주기
					j = 1;
				}else { //같으면 비교값 인덱스 옆으로 한칸 이동
					j++;
				}
				
			}
			
			System.out.println("#" + tc + " " + cnt);

		} // tc

	}// main

}
//			int cnt = 0;
//			int i = price.length - 1;
//			int maxIdx = i; // 최댓값의 인덱스
//
//			for (int j = 1; j < price.length; j++) {
//				if (i - j >= 0 && price[maxIdx] > price[i - j]) {// 만약에 maxIdx의 값보다 i-j가 작다면
//					cnt += price[maxIdx] - price[i - j]; // 두 값의 차이 더해주기
//				} else if (i - j >= 0 && price[maxIdx] < price[i - j]) {// i-j가 더 크다면
//					maxIdx = i - j;
//				}
//			}

//
//				int j = 1;
//				while (i-j >= 0 && price[i] < price[i - j]) { // 내가 서있는 값보다 더 큰값을 만나기 전까지
//					if (price[maxIdx] > price[i - j]) {
//						// 나보다 값이 작으면 값의 차이를 더해주기
//						// 왜냐면 같은 값은 굳이 안세어도 될 것 같아서
//						cnt += price[maxIdx] - price[maxIdx - j];
//					}else if (price[i] < price[i-j]) {//나보다 값이 크면 인덱스 바꿔주기
//						maxIdx = i-j;
//					}else continue;
//					j++;
//				}//while












