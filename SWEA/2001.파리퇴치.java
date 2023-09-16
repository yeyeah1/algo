package array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("input2.txt"));
		
		/* N * N 배열 안의 숫자는 해당 영역에 존재하는 파리의 개수
		*  M * M 크기의 파리채 를 내리쳐 최대한 많은 파리를 죽이자
		*  
		*  5 <= N <= 15
		*  2 <= M <= N
		*  
		*  #test_case 죽인 파리 수
		*/
		int T = sc.nextInt(); //테스트케이스 수 입력

		for(int tc = 1; tc <= T; tc++) {	
			int N = sc.nextInt(); //배열 크기 입력
			int M = sc.nextInt(); //파리채 크기 입력
			
			int[][] fly = new int[N][N]; //N*N크기의 배열 생성
			for(int i = 0; i < N; i++) { //파리 마리수 입력
				for (int j = 0; j < N; j++) {
					fly[i][j] = sc.nextInt();
				}
			}
			int max = 0; //최대값 저장할 변수
			for(int i = 0; i < N; i++) { //배열 전체를 도는 for
				for(int j = 0; j < N; j++) {
					if(i+M-1 < N && j+M-1 < N) { //M*M의 끝이 N을 벗어나지 않으면
						int sum = 0; //각 배열마다 저장할 변수
						for(int si = 0; si < M; si++) { //파리채 도는 for문
							for(int sj = 0; sj < M; sj++) {
								sum += fly[i+si][j+sj]; 
							}
						}
						
						if(sum > max) {
							max = sum;
						}
					} //if문
				}
				
			}//배열 전체를 도는 for문
			
			System.out.println("#" + tc + " " + max);
			
			
			
		}//전체 T반복for문
		

	} //main

} //class
