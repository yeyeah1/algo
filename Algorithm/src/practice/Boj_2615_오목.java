package practice;

import java.util.Scanner;

public class Boj_2615_오목 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 우, 우하대각, 하, 우상대각 
		// 왼쪽 부분을 기준으로 출력해야하기에 우측, 상단을 기준으로 탐색을 진행하게 델타 설정 
		int[] dr = { 0, 1, 1, -1 };
		int[] dc = { 1, 1, 0, 1 };
		
		int[][] om = new int[19][19];
		
		
		
		for (int tc=1; tc<=10; tc++) {
			
			for (int i=0; i<19; i++) {
				for (int j=0; j<19; j++) {
					om[i][j] = sc.nextInt();
				}
			}
			
			int cnt = 1;
			
			out:
			for (int j=0; j<19; j++) {
				for (int i=0; i<19; i++) {
					if ( om[i][j] == 1 || om[i][j] == 2) {
						for (int k=0; k<4; k++) {
							
							cnt = 1;
							int r = i;
							int c = j;
							
							while ( true ) {
								r += dr[k];
								c += dc[k];
								
								if (r>=0 && r<19 && c>=0 && c<19) {
									if (om[i][j] == om[r][c]) {
										cnt++;
									} else {
										break;
									}
								} else {
									break;
								}
							}
							
							r = i;
							c = j;
							
							while ( true ) {
								r -= dr[k];
								c -= dc[k];
								
								if (r>=0 && r<19 && c>=0 && c<19) {
									if (om[i][j] == om[r][c]) {
										cnt++;
									} else {
										break;
									}
								} else {
									break;
								}
							}
							
							if ( cnt == 5 ) {
								System.out.println(om[i][j]);
								System.out.println((i+1)+" "+(j+1));
								break out;
							}
						}
					}
				}
			}
			if (cnt != 5) {
				System.out.println(0);
			}
		}
	}
}