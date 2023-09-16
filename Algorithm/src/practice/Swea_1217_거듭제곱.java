package practice;

import java.util.Scanner;

public class Swea_1217_거듭제곱 {
	
	public static int N;
	public static int M;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			
			sc.next();
			
			N = sc.nextInt();
			M = sc.nextInt();
			
			
			System.out.println("#" + tc + " " + func(N,M));
			
		}//tc

	}//main

	public static int func(int N, int M) {
		
		if(M <= 0) {
			return 1;
		} else {
			return N * func(N, M-1);
		}
		
		
	}
}
