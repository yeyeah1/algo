package boj;

import java.util.Scanner;

public class Boj_2575 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 4; tc++) {
			
			//8개의 값을 입력 받는다
			int a = sc.nextInt(); 
			int b = sc.nextInt(); 
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			int g = sc.nextInt();
			int h = sc.nextInt();
			
			//b.선분
			if(c == e || b == h) {
				System.out.println("b");
			}else if (b == c && c == e && e == h || c == d && d == e && e == h) { //c.점
				System.out.println("c");
			}else if (a+b+c+d < e+f+g+h || a+b+c+d > e+f+g+h ) { //d.분리
				System.out.println("d");
			}else {
				System.out.println("a");
			}
			
		
			
		}//총 4개의 줄을 입력 받음
		
		
	}

}
