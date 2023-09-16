package boj;

import java.util.Scanner;

public class Boj_2810 {

	public static void main(String[] args) {
		
		//첫째줄에 좌석 수
		//둘째줄에 좌석의 정보
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String seat = sc.next();
		
		int cnt = 1;

		for(int i = 0; i < N; i++) {
			
			if(seat.charAt(i) == 'S') {
				cnt++; 
				
			}else {
				cnt++;
				i++;
			}
		}
		
		if(cnt > N) {
			System.out.println(N);
		}else {
			System.out.println(cnt);
		}
		

	}

}
