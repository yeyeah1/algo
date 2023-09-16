package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1094_막대기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int stick = 64; //막대기의 길이
		int count = 0; //막대기 갯수 세어줄 변수
		
		while(X > 0) {
			if(stick > X) { //남은 막대기의 크기가 X보다 클 때 
				stick = stick/2; //반으로 자른다. (하나는 버림)
			}else { //자른 막대기가 X보다 작으면
				X = X - stick; // 막대기를 풀로 붙여줌(????)
				count++; //막대기 개수 세어주기
			}
		}
		System.out.println(count);
		
	}//main

}
