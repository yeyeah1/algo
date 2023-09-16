package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2615_오목 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] board = new int[20][20];
		int len = board.length;
		
		for(int i = 1; i < len; i++) {
			for(int j = 1; j< len; j++) {
				board[i][j] = Integer.parseInt(br.readLine());
			}
		}//바둑판 배열 값 입력받음
		
		//상 우상 우 우하 하 좌하 좌 좌상
		int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
		int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};
		
		int d = 0;
		int cnt = 0;
		
		//배열 순회
		for(int r = 0; r < len; r++) {
			for(int c = 0; c < len; c++) {
				
				int nr = r + dr[d];
				int nc = c + dc[d];
				
				switch(board[r][c]) {
				
				case 0 : continue;
				
				case 1:
					
					for(d = 0; d < 8; d++) {
						
						cnt = 1;
						
						//배열의 범위를 벗어나지 않고 값이 1이면 카운트해주기
						if(nr < len && nr >= 0 && nc < len && nc >= 0 && board[nr][nc] == 1) {
							cnt++;
						}else {
							d = (d+1) % 8; // 아니라면 방향전환
						}
						
						r += dr[d];
						c += dc[d]; //다음 진행 방향으로 전진
						
						if(cnt == 5) {
							
						}
					}
					
					
				
				case 2:
				
				
					
				
				}//switch
				
			}
		}//배열 순회
		
		
		
		
	}//main

}
