package boj;

import java.util.Scanner;

public class Boj_3273 {

	public static void main(String[] args) {
		
		//n개의 서로 다른 양의 정수로 이루어진 수열
		//ai의 값은 1보다 크거나 같고, 1,000,000보다 작거나 같은 자연수
		//자연수 x가 주어졌을 때, ai + aj = x을 만족하는 (ai,aj) 쌍의 수를 구하는 프로그램을 작성
		
		//입력
		//첫째 줄에 수열의 크기 n이 주어진다.
		//다음 줄에는 수열에 포함되는 수가 주어진다
		//셋째 줄에는 x가 주어진다
		
		
		//입력 먼저 받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n]; //n길이의 배열 선언
		// 값 입력 받기
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt(); 
		
		int cnt = 0; //쌍의 수를 카운트 할 변수 생성
		int left = 0;
		int right = n-1;
		
//		for(int i = 0, d = 1; i < arr.length; i++) {
//			//arr의 0번째 인덱스부터 끝의 요소까지 하나씩 더해보고 그 값이 x와 같으면 cnt++
//			 if(i+d < arr.length) {  //i+d의 값이 인덱스의 길이를 넘지 않을 때
//				 if(arr[i] + arr[i+d] == x) {
//				 cnt++;
//				 d++;
//				 continue;
//				 }
//			 }
//		}
//		System.out.println(cnt);
//		
		//배열을 오름차순으로 정렬하기

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
